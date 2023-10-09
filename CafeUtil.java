import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {
    public int getStreakGoal(int numWeeks) {
        // write a method that adds every consecutive integer from 1 to 10 and returns the sum
        // Add a parameter, numWeeks so that an admin can change the number from 10 to whatever they want.
        int sum = 0;
        for(int i = 1; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    // Given an array of item prices from an order, add all of the prices in the array and return the total. 
    public double  getOrderTotal(double[] lineItems) {
        double total = 0;
        for (int i = 0; i < lineItems.length; i++) {
            total += lineItems[i];
        }
        return total;
    }

    // Given an ArrayList of menu items (strings), print out each index and menu item. 
    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i<menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    //addCustomer
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println(String.format("Hello, %s", username));
        System.out.println(String.format("There are %d people in front of you", customers.size()));
        customers.add(username);
        System.out.println(customers);
        
        scanner.close(); // Close the Scanner object
    }

    //  Ninja Bonuses!
    // Ninja bonus 2: Format the prices as currency
    /* 
        void printPriceChart(String product, double price, int maxQuantity)
        Given a product, price and a maxQuantity, create a method that prints
        the cost for buying 1, then the price for buying 2, then for 3 and so on,
        up to the max. For example, if the product is "Columbian Coffee Grounds" 
        with a price of 15.0 and maxQuantity of 3, you should print:
        Columbian Coffee Grounds
        1 - $15.00
        2 - $30.00
        3 - $45.00
    */
    public void printPriceChart(String product, double price, int maxQuantity, double discount) {
        System.out.println(product);
        for(int i =1; i <= maxQuantity; i++){
            double cost = price * 1 - discount * (i - 1);
            System.out.println(i + " - $" + String.format("%.2f", cost));
        }
    }
}
