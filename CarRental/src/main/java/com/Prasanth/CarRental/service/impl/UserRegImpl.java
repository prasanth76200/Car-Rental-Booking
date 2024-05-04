package com.Prasanth.CarRental.service.impl;

import com.Prasanth.CarRental.model.UserRegister;
import com.Prasanth.CarRental.repo.UserRegRepo;
import com.Prasanth.CarRental.service.UserRegService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserRegImpl implements UserRegService{

    UserRegRepo userRegRepo;

    public UserRegImpl(UserRegRepo userRegRepo) {
        this.userRegRepo = userRegRepo;
    }

    @Override
    public String createUser(UserRegister userRegister) {
        userRegRepo.save(userRegister);
        return "User Registration Successfully";
    }

    @Override
    public String updateUser(UserRegister userRegister) {
        userRegRepo.save(userRegister);
        return "User Update Successfully";
    }

    @Override
    public UserRegister readUser(Long userId) {
      return userRegRepo.findById(userId).get();
    }

    @Override
    public String deleteUser(Long userId) {
        userRegRepo.deleteById(userId);
        return "Deleted User Successfully";
    }

    @Override
    public List<UserRegister> getAllUsers() {
        return userRegRepo.findAll();
    }
}
