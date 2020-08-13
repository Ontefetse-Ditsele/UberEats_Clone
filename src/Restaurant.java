/*Ontefetse Ditsele
 *12 August 2020
 *  
 * The 
 * */
import java.util.ArrayList;

public class Restaurant implements UberEatsResturant {
    private String name;
    private double Account;
    private Dish[] signatureDishes;
    private String location;
 
    private Customer client;
    private double cost;
    
    public Restaurant(String name, Dish[] sigDishes,String location){
        this.name = name;
        this.signatureDishes = sigDishes;
        //this.cart = new ArrayList<Dish>();
        this.location = location;
         this.cost = 0.95;


    }
    public void setClient(Customer client) {
        this.client = client;
    }

    // Implemtented Methods To be a Uber Eats Resturant.
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
    //Class Methods
    public ArrayList<Dish> getOrderedCart(){
        return client.getOrder();
    }

    public void checkout(){
        //Creating a Driver to ....
        Bike B =  new Bike("numberPlate", "color", "model","location");
        Driver delivery_boy = new Driver(B,"licenseId","John","Doe","065 789 4433",7000);
        
        
        delivery_boy.setPickUp(this.location);
        delivery_boy.setDropOff(client.getAddress());
        //double cost = calculateCost();
        client.setCash(client.getCash() - this.cost);
        this.Account += this.cost;
        int fee = 10;
        delivery_boy.setCash(7000 + fee);    
    }
    public void calculateCost (){
               for(Dish d : client.getOrder()){
            this.cost += d.getCost();
        }
    }
}