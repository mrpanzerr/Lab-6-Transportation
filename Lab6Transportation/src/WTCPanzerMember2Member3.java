// Import Scanner
import java.util.Scanner;

public class WTCPanzerMember2Member3 {

    public static void main(String[] args) {
        // Initialize Transportation Variables
        Train train = new Train();

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask the user what type of transportation they want to use (Land, Air, Water)
        System.out.println("\tSelect Transportation Type");
        System.out.println("1 for Land, 2 for Air, 3 for Water");
        String choice = input.nextLine();

        // Error handling
        while (!choice.equals("1") &&
            !choice.equals("2") &&
            !choice.equals("3")) {
            System.out.println("Please enter a valid response");
            System.out.println("1 for Land, 2 for Air, 3 for Water");
            choice = input.nextLine();
        }

        /* In a table format, display the options for the type selected, the cost of
        transportation, whether the purchase is for a ticket or for a rental, the average
        speed, and the number of passengers allowed. Ask the user to select which mode of
        transportation they want to use.
        */
        System.out.printf("%-20s%-20s%-15s%-18s%-20s\n", "Transportation", "Ticket or Rental",
                "Cost", "Average Speed", "Max Passengers");
        switch(choice) {
            case "1": // Land
                train.displayOptions();
                break;
            case "2": // Air
                break;
            case "3": // Water
        }
        /* switch land air water
            if land, air, water
                show all land choices in table
                ask for selection
                show selection
                verify answer
                while no, go back to asking
                if yes
                    ask for number of passengers
                    first, assume passenger is less than max
                    after, handle if passengers is more
                    display total cost
                    display travel instructions (make travel instructions
                    its own function in each final subclass)
         */


        // Ask the user to select which mode of transportation they want to use.

        // Display ALL information about the selected mode using an overridden toString method.
    
        // Ask the user to verify that this is the mode of transportation they want to use.

        // Ask the user how many passengers need to travel using that mode of transportation.

        // Display the total cost.

        /* Display travel instructions (what time their flight leaves, where they need to 
        go to pick up a bike rental, etc.) */

    }
}

                break;
            case "2":
                // Air
                break;
            case "3":
                // Water
        }

        /* In a table format, display the options for the type selected, the cost of 
        transportation, whether the purchase is for a ticket or for a rental, the average 
        speed, and the number of passengers allowed. Ask the user to select which mode of 
        transportation they want to use.
        */
        
        // Ask the user to select which mode of transportation they want to use.

        // Display ALL information about the selected mode using an overridden toString method.
    
        // Ask the user to verify that this is the mode of transportation they want to use.

        // Ask the user how many passengers need to travel using that mode of transportation.

        // Display the total cost.

        /* Display travel instructions (what time their flight leaves, where they need to 
        go to pick up a bike rental, etc.) */

        
        // Test for methods
        Transportation taxi = new Transportation();

        taxi.displayOptions();

        System.out.print(taxi.toString());
    }
}
