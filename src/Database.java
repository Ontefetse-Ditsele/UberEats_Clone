import java.io.*;
import java.util.ArrayList;

/**
 * Ontefetse Ditsele
 * 12 August 2020
 * 
 * To handle all readings and writtings to the CSV...
 */

public class Database {
    private ArrayList<Restaurant> resList;
    
    //Instance Variables
    private BufferedReader read;
    private FileWriter write;

    public Database(){  
            this.resList = new ArrayList<Restaurant>();
       }

    public void readRestaurants() throws IOException{
        try {
            read = new BufferedReader(new FileReader("../bin/restos.csv"));
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
                this.resList.add(r);
            }

        } catch (Exception e) {
            System.out.println("Error to " + e.getMessage());
        }finally{
         read.close();
        }
    }
    public void writeOrder() throws IOException{
      try{
        this.write = new FileWriter("../bin/orders.csv",true);
        for (Restaurant r : this.resList){
            write.write("name, itemsOrdered, location\n");
            for(Dish d : r.getOrderedCart()){
                write.write(r.getName() + ",");
                write.write(d.getName() + ",");
                write.write(r.getLocation()+"\n");
            }        
        }
    }catch(IOException e){
      System.out.println("Error "+ e.getMessage());
    }
    finally{
      write.close();
    }
   }
}