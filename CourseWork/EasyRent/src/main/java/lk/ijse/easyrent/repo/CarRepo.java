package lk.ijse.easyrent.repo;

import lk.ijse.easyrent.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Pazindu Shane
 * @created 15/06/2021 - 3:20 PM
 * @project EasyRent
 */
public interface CarRepo extends JpaRepository<Car,String> {
}
