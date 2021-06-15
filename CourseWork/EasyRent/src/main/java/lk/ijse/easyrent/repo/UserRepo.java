package lk.ijse.easyrent.repo;

import lk.ijse.easyrent.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Pazindu Shane
 * @created 14/06/2021 - 7:39 PM
 * @project EasyRent
 */
public interface UserRepo extends JpaRepository<User,String> {

}
