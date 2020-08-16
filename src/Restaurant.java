/*Ontefetse Ditsele
 *12 August 2020
 *  
 * The 
 * */
import java.util.ArrayList;

public class Restaurant implements UberEatsResturant {
    private String name;
    private Dish[] signatureDishes;
    private String location;

    private Customer client;
    private double cost;

    public Restaurant(String name, Dish[] sigDishes, String location) {
        this.name = name;
        this.signatureDishes = sigDishes;
        this.location = location;
        this.cost = 0.0;
    }

    public void setClient(Customer client) {
        this.client = client;
    }

    public double getCost() {
        return this.cost;
    }

    // Implemtented METHODS To be a Uber Eats Resturant.
    @Override
    public Dish[] getSignatureDishes() {
        return this.signatureDishes;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public String getName() {
        return this.name;
    }

    // Class Methods
    public void displayMenu() {
        for (int i = 1; i < 4; i++) {
            System.out.println(i + ".  " + signatureDishes[i - 1]);
        }
    }

    public ArrayList<Dish> getOrderedCart() {
        return client.getOrder();
    }

    public void calculateCost() {
        for (Dish d : client.getOrder()) {
            this.cost += d.getCost();
        }
    }

    public void checkout() {
        int fee = 50;
        Driver delivery_boy = new Driver("jhndxx012", "John", "Doe", "065 789 4433", 7000);
        delivery_boy.setPickUp(this.location);
        delivery_boy.setDropOff(client.getAddress());

        client.setCash(client.getCash() - this.cost);
        delivery_boy.setCash(7000 + fee);
        System.out.println("Your Delivery Driver : - "+delivery_boy);
    }
    
    @Override
    public String toString(){
      return this.location +"  "+ this.name;  
    }
}