package day45_Inheritance.CarTask;

public class Tesla extends Car{
    public Tesla(String brand, String model, String color, int year, double price, double miles) {
        super(brand, model, color, year, price, miles);
    }
    public void autoPilot(){
        System.out.println("Tesla support auto pilot function");
    }
}
