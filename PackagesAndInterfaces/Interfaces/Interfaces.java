package classes;

public class Interfaces {
    public static void main(String[] args){
        Photograph ob = new Photograph("it's a pen", 52, 10, true);
        int x = ob.Price();
        boolean p = ob.isInsuredable();
        System.out.println("Price is " + x + " So, Insurable status is: " + p);
    }
}
