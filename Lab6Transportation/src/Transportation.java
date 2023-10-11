/**
 *   @purpose create a Transportation superclass representing
 *   any method of transportation with associated attributes such
 *   as type, cost, average speed, etc.
 *   @author Gaetano Panzer
 *   @date: 10.25.23
 *   @section: CSC 331-001
 */
public class Transportation {
    // Class Attributes
    private String type; private double cost;
    private boolean purchaseType; private int averageSpeed;
    private int numOfPassengers;

    // Constructor
    public Transportation(String type, double cost, boolean purchaseType,
                          int averageSpeed, int numOfPassengers) {
        this.type = type; this.cost = cost; this.purchaseType = purchaseType;
        this.averageSpeed = averageSpeed; this.numOfPassengers = numOfPassengers;
    }

    // No Argument Constructor
    public Transportation() {
        this.type = "Land"; this.cost = 45.5; this.purchaseType = true;
        this.averageSpeed = 55; this.numOfPassengers = 4;
    }

    // Accessor Methods
    public String getType() {return type;} public double getCost() { return cost;}
    public boolean getPurchaseType() { return purchaseType;}
    public int getAverageSpeed() { return averageSpeed;}
    public int getNumOfPassengers() { return numOfPassengers;}

    // Mutator Methods
    public void setType(String type) {this.type = type;}
    public void setPurchaseType(boolean purchaseType) {this.purchaseType = purchaseType;}
    public void setCost(double cost) {this.cost = cost;}
    public void setAverageSpeed(int averageSpeed) {this.averageSpeed = averageSpeed;}
    public void setNumOfPassengers(int numOfPassengers) {this.numOfPassengers = numOfPassengers;}

    /**
     * display the options for the type selected, the cost of
     * transportation, whether the purchase is for a ticket or for a
     * rental, the average speed, and the number of passengers allowed
     */
    public void displayOptions() {
        System.out.printf("%-20s%-20s%-15s%-18s%-20s\n", "Transport. Type", "Ticket or Rental",
                "Cost", "Average Speed", "Max Passengers");
        System.out.printf("%-20s%-20s%-15.2f%-18d%-20d\n\n", getType(), getPurchaseType() ? "Ticket" : "Rental", getCost(),
                getAverageSpeed(), getNumOfPassengers());
    }

    /**
     * display ALL information about the selected mode using an
     * overridden toString method
     */
    @Override
    public String toString() {
        return String.format("%s: %s\n%s: %s\n%s: $%.2f\n%s: %d\n%s: %d\n\n",
                "Transportation Type", getType(),
                "Ticket or Rental", getPurchaseType() ? "Ticket" : "Rental",
                "Cost", getCost(),
                "Average Speed", getAverageSpeed(),
                "Maximum Passengers", getNumOfPassengers());
    }
}