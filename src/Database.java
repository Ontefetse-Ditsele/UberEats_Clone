import java.io.*;

/**
 * Ontefetse Ditsele
 * 12 August 2020
 * 
 * To handle all readings and writtings to the CSV...
 */

public class Database {
    
    //Instance Variables
    private BufferedReader read;
    private FileWriter write;

    public Database(){ }

    public void readRestaurants(){
        try {
            read = new BufferedReader(new FileReader("./bin/restos.csv"));
            String line; Dish[] sigD = new Dish[3];
            String[] data; int z = 0;
            read.readLine();
            while((line = read.readLine()) != null){
                data = line.split(",");
                //if(location.equals(data[7])){
                for(int i = 1; i < 6;i+=2){
                    sigd[z] = new Dish(data[i],data[i+1]);
                    z++;
                }
                Restaurant r = new Restaurant(data[0], sigD, data[7]);
                this.restaurantList.add(r);
                
            }

        } catch (IOException e) {
            
        }
    }
    
}