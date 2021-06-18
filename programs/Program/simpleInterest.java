package Program;

import java.text.NumberFormat;
import java.util.Scanner;


public class simpleInterest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		while(true) {
			
			interestCalculator();
			
			System.out.print("Do you wanna calculate Interest again(Yes/No)?");
			String runAgain = scan.nextLine().toLowerCase();
			
			if(runAgain.equals("yes"))
				continue;
			else
				break;
		}	
	}
	
	public static void interestCalculator() {
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter the Principle Amount to be invested: ");
			int principle = scan.nextInt();
			
			System.out.print("Annual Interest Rate: ");
			byte interestRate = scan.nextByte();
			
			System.out.print("Year: ");
			byte year = scan.nextByte();
			
			int finalAmount = (principle * interestRate * year) / 100;
			
			int totalAmount = finalAmount + principle;
			
			String amountFormat = NumberFormat.getCurrencyInstance().format(finalAmount);
			System.out.println("Interest is: " + amountFormat);
//			
			System.out.print("Total Amount: " + totalAmount );
		}catch(Exception InputMismatchException){
			System.out.println("Enter only numbers.");
		}
		
	}
	
}
