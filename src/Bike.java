public class Bike implements Vehicle {

    //instance variables
    String numberPlate;
    String color;
    String model;
    String location;
    int base_rate = 10;

    //constructor
    Bike(String numberPlate, String color, String model,String location) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.model = model;
        this.location = location;
    }
 
    //getters
    public String getNumberPlate() {return this.numberPlate;}

    public double getBaseRate() {return this.base_rate;}

    public String getColor() {return this.color;}

    public String getModel(){return this.model;}

    public String getLocation(){return this.location;}

    public String toString() {
        return this.model + " bike of " + this.color + " color, with number plate: " + this.numberPlate + " location found "+this.location;
    }
}