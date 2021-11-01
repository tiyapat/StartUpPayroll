package com.company;

public class Developer extends Staff {

    private int codingHour;
    private int codingRate;

    public int getCodingHour() {
        return codingHour;
    }

    public void setCodingHour(int codingHour) {
        this.codingHour = codingHour;
    }

    public int getCodingRate() {
        return codingRate;
    }

    public void setCodingRate(int codingRate) {
        this.codingRate = codingRate;
    }

    public Developer(String name, int baseSalary, int overtimeHour, int overtimeRate) {
        super(name, baseSalary, overtimeHour, overtimeRate);
    }

    public Developer(String name, int baseSalary, int overtimeHour, int overtimeRate, int codingHour, int codingRate) {
        super(name, baseSalary, overtimeHour, overtimeRate);
        this.codingHour = codingHour;
        this.codingRate = codingRate;
    }

    @Override
    public int getPayment() {
        int staffSalary = super.getPayment();
        int payment = staffSalary + (this.codingHour * this.codingRate);
        System.out.println("Developer payment: " + staffSalary + " plus " +  (this.codingHour * this.codingRate));
        return payment;
    }
}
