import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Ontefetse Ditsele
 * 12 August 2020
 * 
 * A Static Class 
 * To handle all readings and writings to the CSV
 */

public class Database {
    protected static ArrayList<Restaurant> resList = new ArrayList<Restaurant>();
    protected static ArrayList<Restaurant> local = new ArrayList<Restaurant>();    
    private Database(){     }

    public static void readRestaurants(){
        try {
            String path = "C:\\Users\\connex\\OneDrive\\Desktop\\Zaio_deliverables\\UberEats_Clone\\bin\\restos.csv";
            BufferedReader read = new BufferedReader(new FileReader(path));
            String line;String[] data; Dish[] sigD = new Dish[3];
            
            read.readLine();
            while((line = read.readLine()) != null){
                data = line.split(", ");
                sigD[0] = new Dish(data[1],Integer.parseInt(data[2]));
                sigD[1] = new Dish(data[3],Integer.parseInt(data[4]));
                sigD[2] = new Dish(data[5],Integer.parseInt(data[6]));
                
                Restaurant r = new Restaurant(data[0], sigD, data[7]);  
                resList.add(r);
            }
            read.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeOrder(Restaurant r){
      try{
          String path = "C:/Users/connex/OneDrive/Desktop/zaio_deliverables/UberEats_Clone/bin/orders.csv";
          FileWriter write = new FileWriter(path);
          write.write("name, itemsOrdered, location");
          write.write("\n"+r.getName() + ",");
           for(Dish d : r.getOrderedCart()){
                write.write(d.getName() + ";");  
            }
            write.write(r.getLocation());
        write.close();
        }catch(IOException e){
                System.out.println(e.getMessage());
        }
    }

	public static void local(String location) {
        local.clear();
        for(Restaurant r : resList){
            if(location.equals("all")){
                System.out.println(r);
            }
            else if (location.equals(r.getLocation())){
                local.add(r);
                System.out.println(r);
            }
        }
    }
	public static Restaurant get(int selection) {
		return local.get(selection);
	}

	public static void loadOrders(String name) {
        try{
            String pathO = "C:\\Users\\connex\\OneDrive\\Desktop\\Zaio_deliverables\\UberEats_Clone\\bin\\orders.csv";
            BufferedReader read = new BufferedReader(new FileReader(pathO));
            String line;String[] data; String[] items;
            
            read.readLine();
            while((line = read.readLine()) != null){
                data = line.split(", ");
                
                if(name.equals(data[0])){
                    items = data[1].split(";");
                    for (String item :items){
                        System.out.println(item + " from "+data[2]);
                    }
                }
            }
            read.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    
    }
}