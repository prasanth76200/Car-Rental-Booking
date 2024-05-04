package com.Prasanth.CarRental.service;

import com.Prasanth.CarRental.model.CreateRentalVehical;

import java.util.List;

public interface CreateRentalVehicalService {

    public String createRentalVehical(CreateRentalVehical createRentalVehical);
    public CreateRentalVehical getRentalVehical(Long rentalVehicleId);
    public String updateRentalVehical (CreateRentalVehical createRentalVehical);
    public String deleteRentalVehical(Long rentalVehicleId);
    public List<CreateRentalVehical> getAllRentalVehical();


}
