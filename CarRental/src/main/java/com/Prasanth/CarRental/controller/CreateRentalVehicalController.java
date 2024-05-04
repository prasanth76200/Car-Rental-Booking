package com.Prasanth.CarRental.controller;


import com.Prasanth.CarRental.model.CreateRentalVehical;
import com.Prasanth.CarRental.model.UserRegister;
import com.Prasanth.CarRental.service.CreateRentalVehicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/create_rental_vehical")
public class CreateRentalVehicalController {

    @Autowired
    CreateRentalVehicalService createRentalVehicalService;
    @GetMapping("{rentalVehicleId}")
    public CreateRentalVehical getRentalVehical(@PathVariable Long rentalVehicleId) {
        return createRentalVehicalService.getRentalVehical(rentalVehicleId);
    }

    @PostMapping
    public String createNewVehical(@RequestBody CreateRentalVehical createRentalVehical) {
        createRentalVehicalService.createRentalVehical(createRentalVehical);
        return "User created successfully";
    }
    @PutMapping
    public String updateNewVehical(@RequestBody CreateRentalVehical createRentalVehical) {
        createRentalVehicalService.updateRentalVehical(createRentalVehical);
        return "User updated successfully";
    }

    @GetMapping
    public List<CreateRentalVehical> getAllRentalVehical() {
        return createRentalVehicalService.getAllRentalVehical();
    }

}
