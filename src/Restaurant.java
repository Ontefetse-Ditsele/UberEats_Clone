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
    
    public Restaurant(String name, Dish[] sigDishes,String location){
        this.name = name;
        this.signatureDishes = sigDishes;
        this.cart = new ArrayList<Dish>();
        this.location = location;

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
        return this.cart;
    }

    public void checkout(){
        
        /*
        * assing a delivry boy .Driver delivery_boy = new Driver()
        */
        Bike B =  Bike("numberPlate", "color", "model","location");
        Driver delivery_boy = new Driver(B,"licenseId","John","Doe","065 789 4433",7000);
        //Driver(Bike bike, String licenseID, String name, String surname,String phone_number, int cash)
        

        delivery_boy.setPickUp(this.locaton);
        delivery_boy.setDropOff(client.getAddress());


    
    }
}