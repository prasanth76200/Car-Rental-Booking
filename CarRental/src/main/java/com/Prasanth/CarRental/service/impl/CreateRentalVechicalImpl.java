package com.Prasanth.CarRental.service.impl;

import com.Prasanth.CarRental.model.CreateRentalVehical;
import com.Prasanth.CarRental.repo.CreateRentalVehicalRepo;
import com.Prasanth.CarRental.service.CreateRentalVehicalService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CreateRentalVechicalImpl implements CreateRentalVehicalService {

    CreateRentalVehicalRepo createRentalVehicalRepo;

    public CreateRentalVechicalImpl(CreateRentalVehicalRepo createRentalVehicalRepo) {
        this.createRentalVehicalRepo = createRentalVehicalRepo;
    }

    @Override
    public String createRentalVehical(CreateRentalVehical createRentalVehical) {
        createRentalVehicalRepo.save(createRentalVehical);
        return "VEHICLE CREATED";
    }

    @Override
    public CreateRentalVehical getRentalVehical(Long rentalVehicleId) {
        return createRentalVehicalRepo.findById(rentalVehicleId).get();
    }

    @Override
    public String updateRentalVehical(CreateRentalVehical createRentalVehical) {
       createRentalVehicalRepo.save(createRentalVehical);
        return "update vehicle successfully";
    }

    @Override
    public String deleteRentalVehical(Long rentalVehicleId) {
        createRentalVehicalRepo.deleteById(rentalVehicleId);
        return "vehicle successfully deleted";
    }

    @Override
    public List<CreateRentalVehical> getAllRentalVehical() {
        return createRentalVehicalRepo.findAll();
    }
}
