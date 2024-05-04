package com.Prasanth.CarRental.controller;

import com.Prasanth.CarRental.dto.PaymentsDTO;
import com.Prasanth.CarRental.dto.RentalDTO;
import com.Prasanth.CarRental.model.Payments;
import com.Prasanth.CarRental.model.Rental;
import com.Prasanth.CarRental.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/payment_process")



public class PaymentsController {

    @Autowired
    PaymentsService paymentService;

    @PostMapping("/payment")
    public String createPayment(@RequestBody PaymentsDTO paymentsDTO) {
        Payments payment = paymentService.createPayment(paymentsDTO);
        return "Created Successfully";
    }
}
