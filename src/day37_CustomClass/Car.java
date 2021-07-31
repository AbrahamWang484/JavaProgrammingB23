package day37_CustomClass;

public class Car {
    public String make;
    public String color;
    public String model;
    public int price;
    public String year;

    public void drive(){
        System.out.println(make +" "+ model+" "+ year +" is driven.");
    }
    public void setInfo(String carMake, String carColor,String carModel, int carPrice, String carYear){
        make=carMake;
        color= carColor;
        model= carModel;
        price= carPrice;
        year = carYear;
    }
    public void getInfo(){
        System.out.println("make = " + make);
        System.out.println("color = " + color);
        System.out.println("model = " + model);
        System.out.println("price = " + price);
        System.out.println("year = " + year);
    }
}
