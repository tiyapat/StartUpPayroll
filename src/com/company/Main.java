package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Developer dev1 = new Developer("Korn", 40000, 10, 500, 12, 1000);
        Ceo ceo1 = new Ceo("Bill", 100000, 2, 500, 5, 10000);
        Marketing marketing1 = new Marketing("Sara", 25000, 12, 500, 2, 1000);
        Driver driver1 = new Driver("John", 6, 800);
        Cleaner cleaner1 = new Cleaner("Boon", 15, 350);
        Rental rental1 = new Rental("Rental",3000,500);
        Electricity electricity1 = new Electricity("Electricity",3000,100);
        InternetAccess internetAccess1 = new InternetAccess("Internet",5000,100);

        int totalPayment = 0;

        ArrayList<IPayment> expenses = new ArrayList<IPayment>();
        expenses.add(dev1);
        expenses.add(ceo1);
        expenses.add(marketing1);
        expenses.add(driver1);
        expenses.add(cleaner1);
        expenses.add(rental1);
        expenses.add(electricity1);
        expenses.add(internetAccess1);
        for (IPayment cost : expenses) {
            int payment = cost.getPayment();
            System.out.println(cost.getName() + " Payment: " + payment);
            totalPayment += payment;
        }
        System.out.println("Total Payment: " + totalPayment);
    }
}

