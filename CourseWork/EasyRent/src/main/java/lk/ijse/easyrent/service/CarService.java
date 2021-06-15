package lk.ijse.easyrent.service;

import lk.ijse.easyrent.dto.CarDTO;

import java.util.ArrayList;

/**
 * @author Pazindu Shane
 * @created 15/06/2021 - 3:22 PM
 * @project EasyRent
 */
public interface CarService {

    void addCar(CarDTO dto);

    boolean regNoAlreadyExists(String id);

    void deleteCar(String id);

    CarDTO searchCar(String id);

    ArrayList<CarDTO> getAllCars();

    void updateCar(CarDTO dto);
}
