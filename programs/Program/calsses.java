package Program;

import java.util.Scanner;

public class calsses {
		
	public void areaOfSquare() {
		Scanner parameter = new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		int length = parameter.nextInt();
		System.out.print("Enter breath: ");
		int breath = parameter.nextInt();
		
		System.out.print("Area: " + length * breath);
	}
	
	public void function2(double number) {
		System.out.println("Your number is: " + number);
	}
}
