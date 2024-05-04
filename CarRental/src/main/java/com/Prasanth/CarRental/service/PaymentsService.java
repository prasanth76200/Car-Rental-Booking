package com.Prasanth.CarRental.service;

import com.Prasanth.CarRental.dto.PaymentsDTO;
import com.Prasanth.CarRental.dto.RentalDTO;
import com.Prasanth.CarRental.model.Payments;
import com.Prasanth.CarRental.model.Rental;

import java.util.List;

public interface PaymentsService {

    public Payments createPayment(PaymentsDTO paymentsDTO);
    public List<Payments> getAllRentalsWithDetails() ;

}
