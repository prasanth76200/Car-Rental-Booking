package com.Prasanth.CarRental.repo;

import com.Prasanth.CarRental.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalRepo extends JpaRepository<Rental, Long> {
    @Query("SELECT r FROM Rental r JOIN FETCH r.userRegister JOIN FETCH r.createRentalVehicle")
    List<Rental> findAllWithDetails();
}
