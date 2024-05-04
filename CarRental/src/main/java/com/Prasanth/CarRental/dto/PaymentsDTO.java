package com.Prasanth.CarRental.dto;


import java.time.LocalDate;
public class PaymentsDTO {


         private String cardHolderName;
         private String cardName;
         private String cardNumber;
         private String expiryDate;
         private String cvv;
         private Long rentalId;

    public PaymentsDTO(String cardHolderName, String cardName, String cardNumber, String expiryDate, String cvv, Long rentalId) {
        this.cardHolderName = cardHolderName;
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.rentalId = rentalId;


    }

    public String getCardHolderName() {
        return cardHolderName;
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

    public Long getRentalId() {
        return rentalId;
    }

    public void setRentalId(Long userId) {
        this.rentalId = userId;
    }






}



