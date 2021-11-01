package com.company;

public class Electricity implements IPayment{
    private String name;
    private int unit;
    private int rate;
    public Electricity(String name, int unit, int rate) {
        this.name = name;
        this.unit = unit;
        this.rate = rate;
    }
    public void setName(String name) {

        this.name = name;
    }

    public int getUnit() {

        return unit;
    }

    public void setUnit(int unit) {

        this.unit = unit;
    }

    public int getRate() {

        return rate;
    }

    public void setRate(int rate) {

        this.rate = rate;
    }
    @Override
    public int getPayment() {
        int payment = this.unit * this.rate;
        return payment;
    }

    @Override
    public String getName() {

        return this.name;
    }
}
