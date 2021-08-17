package day45_Inheritance.CarTask;

public class Car {
    public String brand, model,  color;
    public int year;
    public double price,miles;

    public Car(String brand, String model, String color, int year, double price, double miles) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.miles = miles;
    }
    public void start(String name){
        System.out.println(name +" start own this car");
    }
    public void drive(String name){
        System.out.println(name +" drive this car");
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}

