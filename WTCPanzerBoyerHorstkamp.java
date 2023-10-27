// Import Scanner
import java.util.Scanner;

public class WTCPanzerBoyerHorstkamp {

    public static void displayAirTransportation(Transportation [] members) {

    }

    public static void displayWaterTransportation(Transportation [] members) {
        System.out.printf("%-20s%-20s%-15s%-18s%-20s\n", "Transportation", "Ticket or Rental",
                "Cost", "Average Speed", "Max Passengers");
        members[4].displayOptions(); members[5].displayOptions();
        members[6].displayOptions();
    }

    /**
     * Display all LandTransportation methods
     * @param members: an array of Transportation objects
     */
    public static void displayLandTransportation(Transportation[] members) {
        System.out.printf("%-20s%-20s%-15s%-18s%-20s\n", "Transportation", "Ticket or Rental",
                "Cost", "Average Speed", "Max Passengers");
        members[0].displayOptions(); members[1].displayOptions();
        members[2].displayOptions(); members[3].displayOptions();
    }

    /**
     * Obtain the index of the Transportation method from the user. Don't accept
     * the response if it's not 0, 1, 2 or 3
     * @return the index of the Transportation object selected
     */
    public static int getChoice(String choice) {
        // Show and ask for the desired Transportation method

        // Error Handling
        Scanner input = new Scanner(System.in);
        switch (choice) {
            case "1":
                System.out.print("""
                        Which mode of land transportation would you like?
                        0 for Train, 1 for Automobile, 2 for Bike, 3 for Bus
                        """);
                String landChoice = input.nextLine();
                while (!landChoice.equals("0") && !landChoice.equals("1") && !landChoice.equals("2") && !landChoice.equals("3")) {
                    System.out.println("Please enter a valid response");
                    System.out.println("0 for Train, 1 for Automobile, 2 for Bike, 3 for Bus");
                    landChoice = input.nextLine();
                }
                // Return the index
                return Integer.parseInt(landChoice);
            case "2": return 0;

            case "3":
                System.out.print("""
                        Which mode of water transportation would you like?
                        0 for Boat, 1 for Submarine, or 2 for Ship:
                        """);
                String waterChoice = input.nextLine();
                while (!waterChoice.equals("0") && !waterChoice.equals("1") && !waterChoice.equals("2")) {
                    System.out.println("Please enter a valid response");
                    System.out.println("0 for Boat, 1 for Submarine, or 2 for Ship");
                    waterChoice = input.nextLine();
                }

                // Return the index
                return Integer.parseInt(waterChoice) + 4;
            default:
                System.out.println("no");
                return 0;
        }
    }

    /**
     * Check if the selected choice is the one they want to stay with
     *
     * @param bool    : a String representing a yes or no answer
     * @param members : an array of Transportation objects
     */
    public static void getRealChoice(String bool, Transportation [] members, String choice) {
        while (!bool.equals("0")) {
            Scanner input = new Scanner(System.in);
            int index = getChoice(choice);
            System.out.print(members[index]);
            System.out.println("Is this your final decision? (0 for yes, any for no)");
            bool = input.nextLine();
        }
    }

    /**
     * Ask the user what mode of transportation they want, display all information about mode
     * and verify their answer
     * @param members: an array of Transportation objects
     * @return the index of the final Transportation object choice
     */
    public static int getFinalChoiceHelper(Transportation [] members, String choice) {
        Scanner input = new Scanner(System.in);

        // Ask the user to select which mode of transportation they want to use.
        int index = getChoice(choice);

        // Display ALL information about the selected mode using an overridden toString method.
        System.out.print(members[index]);

        // Ask the user to verify that this is the mode of transportation they want to use.
        System.out.println("Is this your final decision? (0 for yes, any for no)");
        String bool = input.nextLine();
        getRealChoice(bool, members, choice);

        return index;
    }

    /**
     * Verify that the passengers needed to not exceed the maximum passengers 
     * and ensure a positive, non-zero response. 
     * @param index: the index of the Transportation object choice
     * @param passengers: the number of passengers desired
     * @param members: an array of Transportation objects
     * return passengers: an int object representing the number of passenegrs
     */
    public static int getFinalChoice(int index, int passengers, Transportation [] members, String choice) {
        Scanner input = new Scanner(System.in);
        while(passengers < 1) {
            System.out.print("Passengers must be 1 or more: ");
            passengers = input.nextInt();
        }
        while(passengers > members[index].getNumOfPassengers()) {
            System.out.println("Unfortunately the passengers requested exceeds the maximum number of " +
                    members[index].getNumOfPassengers() + "\nPlease select a new mode of transportation");
            displayLandTransportation(members);

            // Get the final choice
            index = getFinalChoiceHelper(members, choice);

            // Ask the user how many passengers need to travel using that mode of transportation.
            System.out.println("How many passengers are travelling?");
            passengers = input.nextInt();
        }
        return passengers;
    }

    /**
     * Print the final cost and the travel instructions
     * @param members: an array of Transportation objects
     */
    public static void landTransportationFinal(Transportation [] members, String choice) {
        Scanner input = new Scanner(System.in);

        // Display All Land Options
        displayLandTransportation(members);

        // Get the final choice
        int index = getFinalChoiceHelper(members, choice);

        // Ask the user how many passengers need to travel using that mode of transportation.
        System.out.println("How many passengers are travelling?");
        int passengers = input.nextInt();

        passengers = getFinalChoice(index, passengers, members, choice);

        // Display the total cost.
        double totalTickets = passengers * members[index].getCost();
        if (members[index].getPurchaseType()) {
            System.out.printf("Your total comes to %.2f\n", totalTickets);
        }
        else {
            System.out.println("Your total cost comes to " + members[index].getCost());
        }

        /* Display travel instructions (what time their flight leaves, where they need to
        go to pick up a bike rental, etc.) */
        System.out.print(members[index].travelInstructions());
    }

    /**
     * Print the final cost and the travel instructions
     * @param members: an array of Transportation objects
     */
    public static void waterTransportationFinal(Transportation [] members, String choice) {
        Scanner input = new Scanner(System.in);

        // Display All Water Options
        displayWaterTransportation(members);

        // Get the final choice
        int index = getFinalChoiceHelper(members, choice);

        // Ask the user how many passengers need to travel using that mode of transportation.
        System.out.println("How many passengers are travelling?");
        int passengers = input.nextInt();

        passengers = getFinalChoice(index, passengers, members, choice);

        // Display the total cost.
        double totalTickets = passengers * members[index].getCost();
        if (members[index].getPurchaseType()) {
            System.out.printf("Your total comes to %.2f\n", totalTickets);
        }
        else {
            System.out.println("Your total cost comes to " + members[index].getCost());
        }

        /* Display travel instructions (what time their flight leaves, where they need to
        go to pick up a bike rental, etc.) */
        System.out.print(members[index].travelInstructions());
    }

    public static void main(String[] args) {
        // Initialize Transportation Variables
        Train train = new Train(); Automobile auto = new Automobile(); Bike bike = new Bike(); Bus bus = new Bus();
        Boat boat = new Boat(); Submarine submarine = new Submarine(); Ship ship = new Ship();
        // Add Air
        Transportation [] members = {train, auto, bike, bus, boat, submarine, ship};


        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Ask the user what type of transportation they want to use (Land, Air, Water)
        System.out.println("\tSelect Transportation Type");
        System.out.println("1 for Land, 2 for Air, 3 for Water");
        String choice = input.nextLine();

        // Error Handling
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
        switch (choice) {
            case "1" : // Land
                landTransportationFinal(members, choice);
                break;
            case "2" : {
            } // Air
            case "3" : {
                waterTransportationFinal(members, choice);
                break;
            } // Water
        }
    }
}


