package com.company;

public class Marketing extends Staff{

    private int additionalLanguage;
    private int languageRate;

    public int getAdditionalLanguage() {
        return additionalLanguage;
    }

    public void setAdditionalLanguage(int additionalLanguage) {
        this.additionalLanguage = additionalLanguage;
    }

    public int getLanguageRate() {
        return languageRate;
    }

    public void setLanguageRate(int languageRate) {
        this.languageRate = languageRate;
    }

    public Marketing(String name, int baseSalary, int overtimeHour, int overtimeRate) {
        super(name, baseSalary, overtimeHour, overtimeRate);
    }

    public Marketing(String name, int baseSalary, int overtimeHour, int overtimeRate, int additionalLanguage, int languageRate) {
        super(name, baseSalary, overtimeHour, overtimeRate);
        this.additionalLanguage = additionalLanguage;
        this.languageRate = languageRate;
    }

    @Override
    public int getPayment() {
        int staffSalary = super.getPayment();
        int payment = staffSalary + (this.additionalLanguage * this.languageRate);
        System.out.println("Marketing payment: " + staffSalary + " plus " +  (this.additionalLanguage * this.languageRate));
        return payment;
    }
}
