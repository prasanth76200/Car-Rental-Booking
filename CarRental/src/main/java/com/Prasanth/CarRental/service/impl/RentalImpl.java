package com.Prasanth.CarRental.service.impl;

import com.Prasanth.CarRental.dto.RentalDTO;
import com.Prasanth.CarRental.model.CreateRentalVehical;
import com.Prasanth.CarRental.model.Rental;
import com.Prasanth.CarRental.model.UserRegister;
import com.Prasanth.CarRental.repo.CreateRentalVehicalRepo;
import com.Prasanth.CarRental.repo.RentalRepo;
import com.Prasanth.CarRental.repo.UserRegRepo;
import com.Prasanth.CarRental.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentalImpl implements RentalService {
    @Autowired
    RentalRepo rentalRepo;
    private final UserRegRepo userRegisterRepo;
    private final CreateRentalVehicalRepo createRentalVehicalRepo;

    public RentalImpl(RentalRepo rentalRepo, UserRegRepo userRegisterRepo, CreateRentalVehicalRepo createRentalVehicalRepo) {
        this.rentalRepo = rentalRepo;
        this.userRegisterRepo = userRegisterRepo;
        this.createRentalVehicalRepo = createRentalVehicalRepo;
    }
    @Override
    public List<Rental> getAllRentalsWithDetails() {
        return rentalRepo.findAllWithDetails();
    }


//    @Override
//    public String CreateRental(Rental rental) {
//        rentalRepo.save(rental);
//        return "Rental has been created";
//    }

    @Override
    public String UpdateRental(Rental rental) {
        rentalRepo.save(rental);
        return "Rental has been updated";
    }

    @Override
    public Rental getRental(Long rentalId) {
        return rentalRepo.findById(rentalId).get();
    }


    @Override
    public String DeleteRental(Long rentalId) {
        rentalRepo.deleteById(rentalId);
        return "Rental has been deleted";
    }


//    @Autowired
//    public RentalService(RentalRepo rentalRepo, UserRegRepo userRegisterRepo, CreateRentalVehicalRepo createRentalVehicalRepo) {
//        this.rentalRepo = rentalRepo;
//        this.userRegisterRepo = userRegisterRepo;
//        this.createRentalVehicalRepo = createRentalVehicalRepo;
//    }

    public Rental createRental(RentalDTO rentalDTO) {
        UserRegister user = userRegisterRepo.findById(rentalDTO.getUserId()).orElseThrow(() -> new RuntimeException("User not found"));
        CreateRentalVehical vehicle = createRentalVehicalRepo.findById(rentalDTO.getRentalVehicleId()).orElseThrow(() -> new RuntimeException("Vehicle not found"));

        Rental rental = new Rental();
        rental.setUserRegister(user);
        rental.setCreateRentalVehicle(vehicle);
        rental.setStart_date(rentalDTO.getStartDate());
        rental.setEnd_date(rentalDTO.getEndDate());
        rental.setTotal_price(rentalDTO.getTotalPrice());

        return rentalRepo.save(rental);
    }
    public String deleteRental(Long rentalId) {
        if (rentalRepo.existsById(rentalId)) {
            rentalRepo.deleteById(rentalId);
            return "true";
        }
        return "There is no rental Exist";
    }
}
