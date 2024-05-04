package com.Prasanth.CarRental.repo;

import com.Prasanth.CarRental.model.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentsRepo extends JpaRepository<Payments, Long> {
    @Query("SELECT p FROM Payments p JOIN FETCH p.rental r JOIN FETCH r.userRegister JOIN FETCH r.createRentalVehicle")
    List<Payments> findAllWithDetails();
}
