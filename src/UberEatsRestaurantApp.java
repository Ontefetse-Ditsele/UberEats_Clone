import java.util.Scanner;

public class UberEatsRestaurantApp {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to UberEatsApp - signature dish edition FOR RESTAURANTS\n");

        System.out.println("Enter restaurant name\n");
        String name = input.nextLine();

        System.out.println("Loading all orders placed...\n");
        Database.loadOrders(name);
        //load list of orders
        /**
         * 1. Zinger burger & Chips from rondebosch
         * 2. Wings & Chips from rondebosch
         * 3. Zinger burger & Chips from rondebosch
         */
        input.close();
    }
}