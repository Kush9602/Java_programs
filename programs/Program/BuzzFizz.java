package Program;


import java.util.Scanner;

public class BuzzFizz {
	public void buzzFizz() {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scan.nextInt();

        if(number % 3 == 0 && number % 5 == 0)
            System.out.println("FizzBuzz");
        else if(number % 3 == 0)
            System.out.println("Buzz");
        else if(number % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);

        

        
    }
    
}
