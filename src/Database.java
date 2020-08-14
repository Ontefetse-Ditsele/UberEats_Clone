import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Ontefetse Ditsele
 * 12 August 2020
 * 
 * To handle all readings and writtings to the CSV...
 */

public class Database {
    protected static ArrayList<Restaurant> resList = new ArrayList<Restaurant>();
    protected static ArrayList<Restaurant> local = new ArrayList<Restaurant>();    
    private Database(){     }

    public static void readRestaurants() throws IOException{
        try {
            BufferedReader read = new BufferedReader(new FileReader("../bin/restos.csv"));
            String line; Dish[] sigD = new Dish[3];
            String[] data; int z = 0;
            read.readLine();
            while((line = read.readLine()) != null){
                data = line.split(",");
                for(int i = 1; i < 6;i+=2){
                    sigD[z] = new Dish(data[i],Integer.parseInt(data[i+1]));
                    z++;
                }
                Restaurant r = new Restaurant(data[0], sigD, data[7]);
                resList.add(r);
            }
            read.close();
        }catch (Exception e) {
            System.out.println("Error to " + e.getMessage());
        }
    }
    public static void writeOrder(Restaurant r) throws IOException{
      try{
        FileWriter write = new FileWriter("../bin/orders.csv",true);
         write.write("name, itemsOrdered, location\n");
         for(Dish d : r.getOrderedCart()){
                write.write(r.getName() + ",");
                write.write(d.getName() + ",");
                write.write(r.getLocation()+"\n");
            }
        write.close();
        }catch(IOException e){
                System.out.println("Error "+ e.getMessage());
        }
    }

	public static void local(String location) {
        local.clear();
        for(Restaurant r : resList){
            if (location.equals(r.getLocation())){
                local.add(r);
                System.out.println(r);
            }
        }
    }
	public static Restaurant get(int selection) {
		return local.get(--selection);
	}
}