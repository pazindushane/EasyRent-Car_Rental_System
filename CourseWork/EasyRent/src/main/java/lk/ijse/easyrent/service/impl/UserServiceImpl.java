package lk.ijse.easyrent.service.impl;

import lk.ijse.easyrent.dto.UserDTO;
import lk.ijse.easyrent.entity.User;
import lk.ijse.easyrent.exception.ValidateException;
import lk.ijse.easyrent.repo.UserRepo;
import lk.ijse.easyrent.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Pazindu Shane
 * @created 14/06/2021 - 7:42 PM
 * @project EasyRent
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void addUser(UserDTO dto) {
        if (userRepo.existsById(dto.getNic())) {
            throw new ValidateException("Customer Already exist");
        }
        userRepo.save(modelMapper.map(dto, User.class));
    }

    @Override
    public boolean nicAlreadyExists(String nic) {
        return userRepo.existsById(nic);
    }

    @Override
    public void deleteUser(String id) {
        if (!userRepo.existsById(id)) {
            throw new ValidateException("No Customer For Delete..!");
        }
        userRepo.deleteById(id);
    }

    @Override
    public UserDTO searchUser(String id) {
        Optional<User> customer = userRepo.findById(id);
        if (customer.isPresent()) {
            return modelMapper.map(customer.get(), UserDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<UserDTO> getAllUsers() {
        List<User> all = userRepo.findAll();
        return modelMapper.map(all, new TypeToken<ArrayList<UserDTO>>() {
        }.getType());
    }

    @Override
    public void updateUser(UserDTO dto) {
        if (userRepo.existsById(dto.getNic())) {
            userRepo.save(modelMapper.map(dto, User.class));
        }
    }
}
