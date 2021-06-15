package lk.ijse.easyrent.service.impl;

import lk.ijse.easyrent.dto.CarDTO;
import lk.ijse.easyrent.entity.Car;
import lk.ijse.easyrent.exception.ValidateException;
import lk.ijse.easyrent.repo.CarRepo;
import lk.ijse.easyrent.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author Pazindu Shane
 * @created 15/06/2021 - 3:28 PM
 * @project EasyRent
 */

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo carRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void addCar(CarDTO dto) {
        if (carRepo.existsById(dto.getRegistrationNo())) {
            throw new ValidateException("Car Already Exists");
        }
        carRepo.save(modelMapper.map(dto, Car.class));
    }

    @Override
    public boolean regNoAlreadyExists(String id) {
        return false;
    }

    @Override
    public void deleteCar(String id) {

    }

    @Override
    public CarDTO searchCar(String id) {
        return null;
    }

    @Override
    public ArrayList<CarDTO> getAllCars() {
        return null;
    }

    @Override
    public void updateCar(CarDTO dto) {

    }
}
