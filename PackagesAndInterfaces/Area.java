package area;

import java.util.Scanner;

public class Area{
    Scanner scan = new Scanner(System.in);
    public void SquareArea(){
        System.out.print("Enter side of Square: ");
        int side = scan.nextInt();
        System.out.println("Area is Squuare: " + side*side);
   }

    public void TriangleArea(){
        System.out.print("Enter base: ");
        int base = scan.nextInt();
        System.out.println();
        
        System.out.print("Enter height: ");
        int height = scan.nextInt();
        System.out.println(); 

        System.out.println("Area is Triangle: " + (base*height)/2);
    }

    public void RectangleArea(){
        System.out.print("Enter length: ");
        int length = scan.nextInt();
        System.out.println();

        System.out.print("Enter breath: ");
        int breath = scan.nextInt();
        System.out.println();
        
        System.out.println("Area is Rectangle: " + length*breath);
    }
}
