package com.Prasanth.CarRental.controller;

import com.Prasanth.CarRental.dto.RentalDTO;
import com.Prasanth.CarRental.model.Rental;
import com.Prasanth.CarRental.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/car_Rental")
public class RentalController {
    @Autowired
    RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @PostMapping("/create")
    public ResponseEntity<Rental> createRental(@RequestBody RentalDTO rentalDTO) {
        Rental rental = rentalService.createRental(rentalDTO);
        return ResponseEntity.created(URI.create("/car_Rental/create" + rental.getRentalId())).body(rental);
    }

    @GetMapping("/{rentalId}")
    public ResponseEntity<Rental> getRental(@PathVariable Long rentalId) {
        Rental rental = rentalService.getRental(rentalId);
        if (rental == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(rental);
    }

    @GetMapping
    public List<Rental> getAllRentals() {
        return rentalService.getAllRentalsWithDetails();
    }

    @DeleteMapping("/{rentalId}")
    public ResponseEntity<String> deleteRental(@PathVariable Long rentalId) {
        String isDeleted = rentalService.deleteRental(rentalId);
        if(isDeleted.equals("true")) {
            return ResponseEntity.ok("Rental with ID: " + rentalId + " was successfully deleted.");
        }else{
            return ResponseEntity.ok("There is no rental Exist");
        }

    }
}
