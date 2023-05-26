package Homeworks.HW_Lesson6;

public class HW3_Vehicle {
    private double coordinates;
    private double price;
    private double speed;
    private int year;

    public HW3_Vehicle(double coordinates, double price, double speed, int year) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public double getCoordinates() {
        return coordinates;
    }

    public double getPrice() {
        return price;
    }

    public double getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }
}

class Plane extends HW3_Vehicle {
    private double altitude;
    private int passengerCount;

    public Plane(double coordinates, double price, double speed, int year, double altitude, int passengerCount) {
        super(coordinates, price, speed, year);
        this.altitude = altitude;
        this.passengerCount = passengerCount;
    }

    public double getAltitude() {
        return altitude;
    }

    public int getPassengerCount() {
        return passengerCount;
    }
}

class Car extends HW3_Vehicle {
    private String brand;
    private int doors;

    public Car(double coordinates, double price, double speed, int year, String brand, int doors) {
        super(coordinates, price, speed, year);
        this.brand = brand;
        this.doors = doors;
    }

    public String getBrand() {
        return brand;
    }

    public int getDoors() {
        return doors;
    }
}

class Ship extends HW3_Vehicle {
    private int passengerCount;
    private String portOfRegistry;

    public Ship(double coordinates, double price, double speed, int year, int passengerCount, String portOfRegistry) {
        super(coordinates, price, speed, year);
        this.passengerCount = passengerCount;
        this.portOfRegistry = portOfRegistry;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public String getPortOfRegistry() {
        return portOfRegistry;
    }
}