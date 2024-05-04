package com.Prasanth.CarRental.service.impl;

import com.Prasanth.CarRental.dto.PaymentsDTO;
import com.Prasanth.CarRental.model.Payments;
import com.Prasanth.CarRental.model.Rental;
import com.Prasanth.CarRental.repo.PaymentsRepo;
import com.Prasanth.CarRental.repo.RentalRepo;
import com.Prasanth.CarRental.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service; // Import the @Service annotation

import java.util.List;

@Service // Add @Service annotation
@Configuration
@ComponentScan("com.Prasanth.CarRental.service.impl")
public class PaymentImpl implements PaymentsService {

    private final RentalRepo rentalRepo; // Use constructor injection with final fields
    private final PaymentsRepo paymentsRepo;

    @Autowired // Optional annotation (not required since Spring 4.3) for constructor injection
    public PaymentImpl(RentalRepo rentalRepo, PaymentsRepo paymentsRepo) {
        this.rentalRepo = rentalRepo;
        this.paymentsRepo = paymentsRepo;
    }

    @Override
    public Payments createPayment(PaymentsDTO paymentsDTO) {
        Rental rental = rentalRepo.findById(paymentsDTO.getRentalId())
                .orElseThrow(() -> new RuntimeException("Rental not found with ID: " + paymentsDTO.getRentalId()));

        Payments payment = new Payments();
        payment.setRental(rental);
        payment.setCardHolderName(paymentsDTO.getCardHolderName());
        payment.setCardNumber(paymentsDTO.getCardNumber());
        payment.setExpiryDate(paymentsDTO.getExpiryDate());
        payment.setCvv(paymentsDTO.getCvv());

        return paymentsRepo.save(payment);
    }

    @Override
    public List<Payments> getAllRentalsWithDetails() {
        return paymentsRepo.findAllWithDetails();
    }
}
