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
    private String name; private double cost;
    private boolean purchaseType; private int averageSpeed;
    private int numOfPassengers; private String departure;
    private String color;

    // Constructor
    public Transportation(String name, double cost, boolean purchaseType,
                          int averageSpeed, int numOfPassengers, String departure, String color) {
        this.name = name; this.cost = cost; this.purchaseType = purchaseType;
        this.averageSpeed = averageSpeed; this.numOfPassengers = numOfPassengers;
        this.departure = departure; this.color = color;
    }

    // No Argument Constructor
    public Transportation() {
        this.name = "Taxi"; this.cost = 45.5; this.purchaseType = true;
        this.averageSpeed = 55; this.numOfPassengers = 4; this.departure = "3PM";
        this.color = "Yellow";
    }

    // Accessor Methods
    public String getName() {return name;} public double getCost() {return cost;}
    public boolean getPurchaseType() {return purchaseType;}
    public int getAverageSpeed() {return averageSpeed;}
    public int getNumOfPassengers() {return numOfPassengers;}
    public String getDeparture() {return departure;}
    public String getColor() {return color;}

    // Mutator Methods
    public void setName(String name) {this.name = name;}
    public void setPurchaseType(boolean purchaseType) {this.purchaseType = purchaseType;}
    public void setCost(double cost) {this.cost = cost;}
    public void setAverageSpeed(int averageSpeed) {this.averageSpeed = averageSpeed;}
    public void setNumOfPassengers(int numOfPassengers) {this.numOfPassengers = numOfPassengers;}
    public void setDeparture(String departure) {this.departure = departure;}
    public void setColor(String color) {this.color = color;}

    /**
     * display the options for the type selected, the cost of
     * transportation, whether the purchase is for a ticket or for a
     * rental, the average speed, and the number of passengers allowed
     */
    public void displayOptions() {
        System.out.printf("%-20s%-20s%-15.2f%-18d%-20d\n\n", getName(), getPurchaseType() ? "Ticket" : "Rental", getCost(),
                getAverageSpeed(), getNumOfPassengers());
    }

    /**
     * display ALL information about the selected mode using an
     * overridden toString method
     * @return a string
     */
    @Override
    public String toString() {
        return String.format("%21s: %s\n%21s: %s\n%21s: $%.2f\n%21s: %d\n%21s: %d\n%21s: %s\n%21s: %s\n",
                "Transportation", getName(),
                "Ticket or Rental", getPurchaseType() ? "Ticket" : "Rental",
                "Cost", getCost(),
                "Average Speed", getAverageSpeed(),
                "Maximum Passengers", getNumOfPassengers(),
                "Departure Time", getDeparture(),
                "Color", getColor());
    }
}
