class Vehicle {
    private int speed;
    private String colour;
    private int numberOfWheels;

    public Vehicle() {}

    public Vehicle(int speed, String colour, int numberOfWheels) {
        this.speed = speed;
        this.colour = colour;
        this.numberOfWheels = numberOfWheels;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColour() {
        return colour;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}

class MotorVehicle extends Vehicle {
    private String licensePlate;

    public MotorVehicle() {}

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}

class Car extends MotorVehicle {
    private int numberOfDoors;

    public Car() {}

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void display() {
        System.out.println("Speed: " + getSpeed());
        System.out.println("Colour: " + getColour());
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class More_INHERITANCE {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setSpeed(20);
        myCar.setColour("RED");
        myCar.setNumberOfWheels(4);
        myCar.setLicensePlate("xyz123");
        myCar.setNumberOfDoors(2);

        myCar.display();
    }
}
