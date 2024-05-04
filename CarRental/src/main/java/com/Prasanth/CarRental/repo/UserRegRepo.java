package com.Prasanth.CarRental.repo;

import com.Prasanth.CarRental.model.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegRepo extends JpaRepository<UserRegister, Long>{
}
