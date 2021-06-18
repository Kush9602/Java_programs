package com.mortages;

import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator {
    public void mortgageCalculator(){
        final byte Months_In_Year = 12;
        final byte Percentage = 100;

        int principle = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        try{

            while(true) {
                System.out.print("Principle(₹1K - ₹1M): ");
                principle = scanner.nextInt();
                if (principle >= 1000 && principle <= 1_000_000)
                    break;
                System.out.println("Please enter number between ₹1000 - ₹1,000,000.");

            }

            while(true){
                System.out.print("Annual Interest Rate: ");
                float annualInterest = scanner.nextFloat();
                if(annualInterest >= 1 && annualInterest <= 30 ) {
                    monthlyInterest = annualInterest / Percentage / Months_In_Year;
                    break;
                }
                System.out.println("Interest can only between 1 to 30.");
            }

            while(true){
                System.out.print("Period(Year): ");
                byte year = scanner.nextByte();
                if(year >= 1 && year <= 30 ) {
                    numberOfPayments = year * Months_In_Year;
                    break;
                }
                System.out.println("You can only take loan minimum of 1yr and maximum of 50yrs.");
            }

            //Formula for calculate mortgage
            double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayments) / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1));

            String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage amount will be " +mortgageFormat);

        }catch(Exception InputMismatchException) {
            System.out.println("Only numbers are valid format for input.");
        }

    }

}
