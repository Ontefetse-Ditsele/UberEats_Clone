/*Ontefetse Ditsele
 *12 August 2020
 *  
 * The 
 * */
import java.util.ArrayList;

public class Restaurant implements UberEatsResturant {
    private String name;
    private ArrayList<Dish> signatureDishes;
    private String location;

    public Restaurant(String name, Dish[] sigDishes,String location){
        this.name = name;
        this.signatureDishes = new ArrayList<Dish>();
        this.location = location;
    }


    // Implemtented Methods
    @Override
    public ArrayList<Dish> getSignatureDishes() {
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
    
}