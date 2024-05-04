package com.Prasanth.CarRental.service;

import com.Prasanth.CarRental.model.UserRegister;

import java.util.List;

public interface UserRegService {

    public String createUser(UserRegister userRegister);
    public String updateUser(UserRegister userRegister);
    public UserRegister readUser(Long userId);
    public String deleteUser(Long userId);
    public List<UserRegister> getAllUsers();

}
