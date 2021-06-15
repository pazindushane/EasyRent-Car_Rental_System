package lk.ijse.easyrent.controller;

import lk.ijse.easyrent.dto.UserDTO;
import lk.ijse.easyrent.exception.NotFoundException;
import lk.ijse.easyrent.service.UserService;
import lk.ijse.easyrent.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * @author Pazindu Shane
 * @created 14/06/2021 - 8:18 PM
 * @project EasyRent
 */

@RestController
@RequestMapping(path = "/api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping(path = "/registerUser", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveUser(@RequestBody UserDTO dto) {
        if (dto.getNic().trim().length() <= 0) {
            throw new NotFoundException("User NIC Cannot Be empty");
        }
        service.addUser(dto);
        return new ResponseEntity(new StandardResponse("200", "Done", dto), HttpStatus.ACCEPTED);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllUsers() {
        ArrayList<UserDTO> allusers = service.getAllUsers();
        return new ResponseEntity(new StandardResponse("200", "Done", allusers), HttpStatus.OK);
    }
    //methana params ne daala thiyenne.. haiyo //harine
    @GetMapping(path =  "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity searchUser(@PathVariable String id) {
        UserDTO userDTO = service.searchUser(id);
        return new ResponseEntity(new StandardResponse("200", "Done", userDTO), HttpStatus.OK);
    }

    @DeleteMapping(params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteUser(@RequestParam String id) {
        service.deleteUser(id);
        return new ResponseEntity(new StandardResponse("200", "Done", null), HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateUser(@RequestBody UserDTO dto) {
        if (dto.getNic().trim().length() <= 0) {
            throw new NotFoundException("No Nic Provide To Update");
        }
        service.updateUser(dto);
        return new ResponseEntity(new StandardResponse("200", "Done", dto), HttpStatus.OK);
    }

    @PostMapping(path = "/uploadimage")
    public ResponseEntity uploadImage(@RequestPart("file") MultipartFile multipartFile, @RequestParam String nic) {

        if (service.nicAlreadyExists(nic)) {
            throw new RuntimeException("Duplicate NIC Entry!");
        }
        System.out.println(multipartFile.getOriginalFilename());
        try {
            String projectpath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();

            File uploadsDir = new File(projectpath + "/uploads");
            uploadsDir.mkdir();

            multipartFile.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + multipartFile.getOriginalFilename()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String filepath = "D:/I J S E/Spring Framework/CourseWork/CourseWork/EasyRent/target/BackEnd-1.0.0/uploads" + multipartFile.getOriginalFilename();

        StandardResponse standardResponse = new StandardResponse("200", "Success!", filepath);
        return new ResponseEntity(standardResponse, HttpStatus.OK);
    }
}
