package com.yearup;

public class CellPhone {
    private String serialNUmber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //constructor that takes the above variables as parameters
    CellPhone(String serialNUmber, String model, String carrier, String phoneNumber, String owner){
        this.serialNUmber = serialNUmber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public String getSerialNUmber() {
        return serialNUmber;
    }

    public void setSerialNUmber(String serialNUmber) {
        this.serialNUmber = serialNUmber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
