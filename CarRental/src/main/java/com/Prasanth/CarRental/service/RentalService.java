package com.Prasanth.CarRental.service;

import com.Prasanth.CarRental.dto.RentalDTO;
import com.Prasanth.CarRental.model.CreateRentalVehical;
import com.Prasanth.CarRental.model.Rental;
import com.Prasanth.CarRental.model.UserRegister;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RentalService {
//    public String CreateRental(Rental rental);
    public String UpdateRental(Rental rental);
    public Rental getRental(Long rentalId);
    public List<Rental> getAllRentalsWithDetails();
    public Rental createRental(RentalDTO rentalDTO);
    public String deleteRental(Long rentalId);
    String DeleteRental(Long rentalId);
}
