package com.company;

public class Ceo extends Staff {

    private int expYear;
    private int expRate;

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public int getExpRate() {
        return expRate;
    }

    public void setExpRate(int expRate) {
        this.expRate = expRate;
    }

    public Ceo(String name, int baseSalary, int overtimeHour, int overtimeRate) {
        super(name, baseSalary, overtimeHour, overtimeRate);
    }

    public Ceo(String name, int baseSalary, int overtimeHour, int overtimeRate, int expYear, int expRate) {
        super(name, baseSalary, overtimeHour, overtimeRate);
        this.expYear = expYear;
        this.expRate = expRate;
    }

    @Override
    public int getPayment() {
        int staffSalary = this.baseSalary;
        int payment = staffSalary + (this.expYear * this.expRate);
        System.out.println("CEO payment: " + staffSalary + " plus " +  (this.expYear * this.expRate));
        return  payment;
    }
}
