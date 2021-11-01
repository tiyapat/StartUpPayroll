package com.company;

public class Staff implements IPayment{

    private String name;
    protected int baseSalary;
    private int overtimeHour;
    private int overtimeRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getOvertimeHour() {
        return overtimeHour;
    }

    public void setOvertimeHour(int overtimeHour) {
        this.overtimeHour = overtimeHour;
    }

    public int getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(int overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public Staff(String name, int baseSalary, int overtimeHour, int overtimeRate) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.overtimeHour = overtimeHour;
        this.overtimeRate = overtimeRate;
    }

    public int getPayment(){
        int payment = this.baseSalary + (this.overtimeHour * this. overtimeRate);
        return payment;
    }
}
