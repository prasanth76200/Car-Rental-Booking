package com.Prasanth.CarRental.model;

import jakarta.persistence.*;

@Entity
@Table(name="rental_payments")
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="paymentId")
   private Long paymentId;
   private String cardHolderName;
   private String cardName;
   private String cardNumber;
   private String expiryDate;
   private String cvv;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="rental_id" )
    private Rental rental;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="rentalVehicleId")
//    private CreateRentalVehical createRentalVehicle;
//

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public Payments() {
    }

    public Payments(String cardHolderName, String cardName, String cardNumber, String expiryDate, String cvv) {

        this.cardHolderName = cardHolderName;
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getCardHolderName(String cardHolderName) {
        return this.cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
