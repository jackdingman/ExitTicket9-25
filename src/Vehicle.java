//superclass

public class Vehicle {
    private double cost; //declarations
    private String manufacturer;
    private int numberOfSeats;

    public Vehicle(double cost, String manufacturer, int numberOfSeats) {
        this.cost = cost;
        this.manufacturer = manufacturer;
        this.numberOfSeats = numberOfSeats;
    }
    public double getCost() {
        return cost;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + "\n" + "Number of seats: " + numberOfSeats + "\n" + "Cost: " + cost;
    }
}
