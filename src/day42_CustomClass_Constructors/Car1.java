package day42_CustomClass_Constructors;

public class Car1 {
    public String make,model,color;
    public int year, price, numberOfWheels;
    public static String product ="car";

    public Car1(String make, String model, String color, int year, int price, int numberOfWheels) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }

    public void drive(String name){
        System.out.println(name + " is drive "+ make );
    }

}
/*
3. Create a class called Car
            Variables:
                make, model, color, year, price, numberOfWheels
            Add a constructor to initialize all the fields
            Add a static block to initialize all the statics
           Methods:
                drive(), toString()
 */