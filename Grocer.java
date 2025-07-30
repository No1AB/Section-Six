import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {

        System.out.println("\nWelcome to Java Grocers.");
        System.out.println("What can I help you find?");

        Scanner scan = new Scanner(System.in);
        String query = scan.nextLine();

        String[] inventory = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };

        
        for (int i = 0; i < inventory.length; i++) {
            if (query.equals(inventory[i])) {
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }
        }

    }
}
