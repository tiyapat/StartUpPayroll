package com.company;

public class Driver implements IPayment{
    private String name;
    private int noOfTrip;
    private int rate;

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfTrip() {
        return noOfTrip;
    }

    public void setNoOfTrip(int noOfTrip) {
        this.noOfTrip = noOfTrip;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Driver(String name, int noOfTrip, int rate) {
        this.name = name;
        this.noOfTrip = noOfTrip;
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        int payment = this.noOfTrip * this.rate;
        return payment;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
