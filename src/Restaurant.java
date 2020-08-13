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

    //Ideal a hash map to have cd 
    private ArrayList<Dish> cart; 
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

    // Implemtented Methods
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
    //This fuction will be in Customer, thus might remove it
    public void addDish(Dish d) {
        this.cart.add(d);
    }
    public void removeDish(Dish d) {
        this.cart.remove(d);
    }
    .
    public void displayCart(){
        for (Dish d : this.cart){
            System.out.println(d);
        }
    }
    public void checkout(){
        /*
        * assing a delivry boy .Driver delivery_boy = new Driver()
        */
        Driver delivery_boy = new Driver("John","Doe","johndoe@hotmail.com",7000,this.location, client.getAddress());
        /* process payment, 
            - charge the customer, pay the driver & update account.
        *display the basket
        *& give an E.T.A
        */
    
    }
}