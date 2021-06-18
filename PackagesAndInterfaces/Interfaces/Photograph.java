package classes;

interface Sellable{                                 // Interface 1
    public String description();
    public int Price();
}

interface Transportable{                            // Interface 2
    public int weight();
    // public int price();
    public boolean isHazardous();
}

interface Insured extends Sellable, Transportable{  // Interface 3 inherit from 1 and 2 (Multiple Inheritance)
    public boolean isInsuredable();
}


public class Photograph implements Insured{
    private String description;
    private int price;
    private int weight;
    private boolean isHazardous;
    private int height = 0, width = 0, depth = 0;
    private boolean insurable;

    public Photograph(String description, int price, int weight, boolean isHazardous){
        this.description = description;
        this.price = price;
        this.weight = weight;
        this. \ isHazardous = isHazardous;
    }

    public String description(){
        return description;
    }

    public int Price(){
        return price;
    }

    public int weight(){
        return weight;
    }
    
    public boolean isHazardous(){
        return isHazardous;
    }

    public int setBox(int h , int w, int d){
        height = h;
        width = w;
        depth = d;

        int volume = height * width * depth;
        return volume;
    }

    public boolean isInsuredable(){
        if(price > 50)
            insurable = true;
        return insurable;
    }

}


