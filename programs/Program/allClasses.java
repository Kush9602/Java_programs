package Program;

import java.text.NumberFormat;
import java.util.Scanner;

public class allClasses {
	
	public void interestCalculator() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Principle Amount to be invested: ");
		int principle = scan.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		byte interestRate = scan.nextByte();
		
		System.out.print("Year: ");
		byte year = scan.nextByte();
		
		int finalAmount = principle * (1 + interestRate * year);
		
		String amountFormat = NumberFormat.getCurrencyInstance().format(finalAmount);
		System.out.println("Interest is: " + amountFormat);
	}
	
	
	public void function1(String name) {
		System.out.println("Your Name is: " + name);
	}
	
	public void function2(double number) {
		System.out.println("Your number is: " + number);
	}
}
