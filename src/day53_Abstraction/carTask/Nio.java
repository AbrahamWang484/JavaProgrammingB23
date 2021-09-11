package day53_Abstraction.carTask;

public class Nio extends Car implements ElectricCar,AutoPilot{
    public Nio( String model, String color, int year, double price) {
        super("Nio", model, color, year, price);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void charging() {

    }
}
