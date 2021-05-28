package polymorphism.buchalkapolimorphism.challengecar;

public class Car {
    private String name;
    private String fuelName;
    private String color;
    private double cylinders;
    private int numberOfDoors;

    public Car(String name, String fuelName, String color, double cylinders, int numberOfDoors) {
        this.name = name;
        this.fuelName = fuelName;
        this.color = color;
        this.cylinders = cylinders;
        this.numberOfDoors = numberOfDoors;
    }

    public String getName() {
        return name;
    }

    public String getFuelName() {
        return fuelName;
    }

    public String getColor() {
        return color;
    }

    public double getCylinders() {
        return cylinders;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String starEngine() {
        return "Car " + getName() + " starts engine with cylinders " + getCylinders() + ".";
    }

    public String accelerate() {
        return "Your " + getColor() + " " + getName() + " car accelerates!";
    }

    public String fuel() {
        return "You should fuel your " + getName() + " car with " + getFuelName() + ".";
    }

    public String closeDoors() {
        return "You closed all " + getNumberOfDoors() + " in your " + getName() + " car.";
    }
}
