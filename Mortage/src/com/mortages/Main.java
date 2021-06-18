/*                                           Mortgage calculation

                           {monthlyInterestRate(1 + monthlyInterestRate)^no. of month you pay the loan}
   Mortgage = PRINCIPLE X -----------------------------------------------------------------------------
                                   (1 + monthlyInterestRate)^no. of month you pay the loan - 1
  M = P x {[r(1 + r)^n] / (1 + r)^n - 1 }

*/
package com.mortages;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        boolean runAgain ;

        Scanner scanner = new Scanner(System.in);
        MortgageCalculator mortgage = new MortgageCalculator();

        do{
            mortgage.mortgageCalculator();

            while(true) {
                System.out.print("Do you Wanna calculate Mortgage Again(Yes/No)? ");
                String data = scanner.nextLine().toLowerCase();
                if (data.equals("yes")) {
                    runAgain = true;
                    break;
                }
                else if (data.equals("no")) {
                    runAgain = false;
                    break;
                }

                System.out.println("Enter only yes or no.");
            }

        }while(runAgain);

    }
}
