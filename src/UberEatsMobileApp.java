/**
 * Ontefetse Ditsele
 * 13 August 2020
 *
*/
import java.util.Scanner;

public class UberEatsMobileApp {
    static Scanner input; static Restaurant myRes;static Customer me;
    static int selection; static String ans;
    /**
     * This is the main function that runs when I run the file after compiling.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to UberEatsApp - signature dish edition\n");
        
        System.out.println("Select location to load restaruants. Options are rondebosch, kenilworth, seapoint or all\n");
        String location = input.nextLine();

        System.out.println("Loading restaurants in your area...\n");
        Database.local(location);
        //load list of restaruants
        /**
         * 1. KFC
         * 2. McDonalds
         * 3. Burger King
         * ....from CSV file
         */

        System.out.println("Select restaurant number (eg '1' for KFC)...\n");
        selection = input.nextInt();
        
        myRes = Database.get(selection);
        me = new Customer("Ontefetse", "Ditsele", "065 879 3322", "Green Point", 23590);
        myRes.setClient(me);
        System.out.println("Loading dishes from your selected restaurant...\n");
        myRes.displayMenu();
        //load dishes of restaruant
        /**
         * 1. signaturedish1 worth R400
         * 2. signaturedish2 worth R400
         * 3. signaturedish3 worth R400
         * ....from CSV file
         */

        System.out.println("Your cart is currently empty");
        System.out.println("Type in Item Number'(1/2/3) dishNumber");
        selection= input.nextInt();

        me.addDish(myRes.getSignatureDishes()[selection]);
        input.nextLine();
        decide();
         //add items to cart    //suggestion: user arraylist to store cart items 
         //when item is added to cart, cart is displayed as an arraylist showing items added to cart

         //System.out.println("Press 'd index' to delete item from cart...\n");
         //user can click on d+(index) to delete a dish from the cart
         //when item is deleted from cart, cart is displayed as an arraylist showing items in the cart
        
        
         me.displayOrder();
         myRes.calculateCost();
         System.out.println("Cost of Order: R" + myRes.getCost());
         System.out.println("Please confirm your order by pressing y for yes\n");
        
        ans = input.nextLine();
        if(ans.equals("n"))
            decide();
        else
            myRes.checkout();
        System.out.println("Order has been placed! Thank you for your time. Restaurant will process your order soon!\n");
        input.close();
    }

    public static void decide(){
        do{
            me.displayOrder();
            System.out.println("What do you want to do (a)dd Item | (d)elete Item | (c)heckout:");
            ans = input.nextLine();
            switch(ans){
                case "a":
                        System.out.println("Type in Item Number'(1/2/3) dishNumber\n");
                        selection = input.nextInt();
                        me.addDish(myRes.getSignatureDishes()[selection]);
                        break;
                case "d":
                        System.out.println("Which dish do want to delete [1/2/../14 ]");
                        selection = input.nextInt(); input.nextLine();
                        me.removeDish(--selection);
                        break;
                case "c":
                    break;
            }
        }while(!(ans.equals("c")));
    }
}