package com.Prasanth.CarRental.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="rental_vehicle")
@SequenceGenerator(name = "rental_seq", sequenceName = "rental_seq", allocationSize = 1)

public class CreateRentalVehical {
    @Id
//    @Column(name="rentalVehicleId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rental_seq")
    private Long rentalVehicleId;
    @Column(nullable = false)
    private String model;
    private String year;
    private String type;
    private String color;
    @Column(nullable = false)
    private Long pricePerDay;
    private String brand;
    private int capacity;
    private String location;

    @OneToMany(mappedBy = "createRentalVehicle")
    private List<Rental> rentals;

    public CreateRentalVehical(String location, int capacity, String brand, Long pricePerDay, String color, String type, String year, String model) {

        this.location = location;
        this.capacity = capacity;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.color = color;
        this.type = type;
        this.year = year;
        this.model = model;
//        this.rentalVehicleId = rentalVehicleId;
    }

    public CreateRentalVehical() {

    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Long pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getRentalVehicleId() {
        return rentalVehicleId;
    }

    public void setRentalVehicleId(Long rentalVehicleId) {
        this.rentalVehicleId = rentalVehicleId;
    }
}
