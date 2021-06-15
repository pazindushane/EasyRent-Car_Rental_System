package lk.ijse.easyrent.controller;

import lk.ijse.easyrent.dto.CarDTO;
import lk.ijse.easyrent.exception.NotFoundException;
import lk.ijse.easyrent.service.CarService;
import lk.ijse.easyrent.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @author Pazindu Shane
 * @created 15/06/2021 - 3:33 PM
 * @project EasyRent
 */

@RestController
@RequestMapping(path = "/api/v1/car")
@CrossOrigin
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping(path = "/registercar")
    public ResponseEntity addcar(@RequestBody CarDTO dto) {
        if (dto.getRegistrationNo().trim().length() <= 0) {
            throw new NotFoundException("Car Reg Cannot be Empty");
        }
        carService.addCar(dto);
        return new ResponseEntity(new StandardResponse("200", "Done", dto), HttpStatus.CREATED);
    }

    @PostMapping(path = "/uploadCarImage")
    public ResponseEntity uploadCarImage(@RequestPart("file") MultipartFile multipartFile, @RequestParam String registrationNo) {
        if (carService.regNoAlreadyExists(registrationNo)) {
            throw new RuntimeException("Duplicate Reg No Entered");
        }
        System.out.println(multipartFile.getOriginalFilename());
        try {
            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();

            File uploadsDir = new File(projectPath + "/uploads/CarImages");
            uploadsDir.mkdir();

            multipartFile.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + multipartFile.getOriginalFilename()));
        }catch (URISyntaxException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        String filePath = "D:/I J S E/Spring Framework/CourseWork/CourseWork/EasyRent/target/BackEnd-1.0.0/uploads/CarImages/" + multipartFile.getOriginalFilename();

        StandardResponse standardResponse = new StandardResponse("200", "Success!", filePath );
        return new ResponseEntity(standardResponse, HttpStatus.OK);
    }
}
