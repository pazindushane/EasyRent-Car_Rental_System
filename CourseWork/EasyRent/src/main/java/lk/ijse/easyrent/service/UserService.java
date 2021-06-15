package lk.ijse.easyrent.service;


import lk.ijse.easyrent.dto.UserDTO;

import java.util.ArrayList;

/**
 * @author Pazindu Shane
 * @created 14/06/2021 - 7:42 PM
 * @project EasyRent
 */


public interface UserService {
    void addUser(UserDTO dto);

    boolean nicAlreadyExists(String nic);

    void deleteUser(String id);

    UserDTO searchUser(String id);

    ArrayList<UserDTO> getAllUsers();

    void updateUser(UserDTO dto);
}
