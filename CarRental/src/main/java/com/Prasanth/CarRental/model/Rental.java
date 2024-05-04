package com.Prasanth.CarRental.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@SequenceGenerator(name = "realRental_seq", sequenceName = "realRental_seq", allocationSize = 1)
@Table(name="rentals")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "realRental_seq")
    @Column(name ="rentalId")
    private Long rentalId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id" )
    private UserRegister userRegister;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="rentalVehicleId")
    private CreateRentalVehical createRentalVehicle;


    //    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyy-MM-dd")
    private LocalDate start_date;

//    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyy-MM-dd")
    private LocalDate end_date;

    private Long total_price;


    public Rental() {
    }


    public Rental(CreateRentalVehical createRentalVehicle, UserRegister userRegister) {
        this.createRentalVehicle = createRentalVehicle;
        this.userRegister = userRegister;
    }
    

    public Rental(UserRegister userRegister, CreateRentalVehical createRentalVehicle, LocalDate start_date, LocalDate end_date, Long total_price) {
        this.userRegister = userRegister;
        this.createRentalVehicle = createRentalVehicle;
        this.start_date = start_date;
        this.end_date = end_date;
        this.total_price = total_price;
    }

    public UserRegister getUserRegister() {
        return userRegister;
    }

    public void setUserRegister(UserRegister userRegister) {
        this.userRegister = userRegister;
    }

    public CreateRentalVehical getCreateRentalVehicle() {
        return createRentalVehicle;
    }

    public void setCreateRentalVehicle(CreateRentalVehical createRentalVehicle) {
        this.createRentalVehicle = createRentalVehicle;
    }

    public Long getRentalId() {
        return rentalId;
    }

    public void setRentalId(Long rentalId) {
        this.rentalId = rentalId;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public Long getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Long total_price) {
        this.total_price = total_price;
    }


}
