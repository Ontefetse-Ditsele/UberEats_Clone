/**
 * Ontefetse Ditsele
 * A Dish with will carry all the information of any dish/menu
 * a resturant has
 *  
 * 12 August 2020
 */

public class Dish {
    private String name;
    private int cost;

    public Dish(String name,int cost){
        this.name = name;
        this.cost = cost;
    }
    public String getName(){ 
        return this.name; 
    }
    public int getCost(){ 
        return this.cost; 
    }

    @Override
    public String toString(){
        return this.name + "  Worth " +this.cost;
    }
}
