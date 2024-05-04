package com.Prasanth.CarRental.dto;

import java.time.LocalDate;

public class RentalDTO {

        private Long userId;
        private Long rentalVehicleId;
        private LocalDate startDate;
        private LocalDate endDate;
        private Long totalPrice;

    public RentalDTO(Long totalPrice, LocalDate endDate, LocalDate startDate, Long rentalVehicleId, Long userId) {
        this.totalPrice = totalPrice;
        this.endDate = endDate;
        this.startDate = startDate;
        this.rentalVehicleId = rentalVehicleId;
        this.userId = userId;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Long getRentalVehicleId() {
        return rentalVehicleId;
    }

    public void setRentalVehicleId(Long rentalVehicleId) {
        this.rentalVehicleId = rentalVehicleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
