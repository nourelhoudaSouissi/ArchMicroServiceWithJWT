package com.securityEcommerce.service.Imp;


import com.securityEcommerce.models.User;
import com.securityEcommerce.repository.UserRepository;
import com.securityEcommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User CreateUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public User UpdateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> AllUser() {

        return userRepository.findAll();
    }

    @Override
    public User GetbyId(Long id) {
        return userRepository.findById(id).orElse(null);
    }


    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }

    @Override
    public void DeleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
