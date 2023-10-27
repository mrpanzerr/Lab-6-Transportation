/**
 *   @purpose create a AirTransportation subclass representing
 *   transportation by dirigible, helicopter, hot air balloon or plane with attributes
 *   representing whether the mode is fueled with gasoline or propane, whether the mode
 *   is propelled by an engine, propellers or the wind
 *   @author Christian Boyer
 *   @date: 10.26.23
 *   @section: CSC 331-001
 */
public class AirTransportation extends Transportation {
    // Class Attributes
    private String fueledBy; private String propelledBy; private String pilotName;
    // Constructor
    public AirTransportation(String name, double cost, boolean purchaseType,
                             int averageSpeed, int numOfPassengers, String departure,
                             String color, String fueledBy, String propelledBy, String pilotName) {
        // From Transportation
        super(name, cost, purchaseType, averageSpeed, numOfPassengers, departure, color);

        this.fueledBy = fueledBy; this.propelledBy = propelledBy; this.pilotName = pilotName;
    }

    // No Argument Constructor
    public AirTransportation() {
        this.setName("Zeppelin"); this.setCost(495.99); this.setPurchaseType(true);
        this.setAverageSpeed(35); this.setNumOfPassengers(12); this.setDeparture("12PM");
        this.setColor("White");

        this.fueledBy = "gasoline"; this.propelledBy = "engine"; this.pilotName = "George";
    }

    // Accessor Methods
    public String getFueledBy() {return fueledBy;}
    public String getPropelledBy() {return propelledBy;}
    public String getPilotName() {return pilotName;}

    // Mutator Methods
    public void setFueledBy(String fueledBy) {this.fueledBy = fueledBy;}
    public void setPropelledBy(String propelledBy) {this.propelledBy = propelledBy;}
    public void setPilotName(String pilotName) {this.pilotName = pilotName;}

    /**
     * display ALL information about the selected mode using an
     * overridden toString method
     * @return a string
     */
    @Override
    // From Transportation
    public String toString() {
        return super.toString() + String.format("%21s: %s\n%21s: %s\n%21s: %s\n",
                "Fueled by", getFueledBy(),
                "Propelled by", getPropelledBy(),
                "Piloted by", getPilotName());

    }
}