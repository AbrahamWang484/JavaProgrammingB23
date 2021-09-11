package day44_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<=0){
            return;
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            return;
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    @Override
    public String toString() {
        if (price==0){
            return "Candy{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", price= free" +
                    ", hasPeanuts=" + hasPeanuts +
                    '}';
        }else {
            return "Candy{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    ", hasPeanuts=" + hasPeanuts +
                    '}';
        }


    }
    public static void main(String[] args) {
        ArrayList<Candy> candyArrayList = new ArrayList<>();
        Candy candy1 = new Candy("Kit Kat", 5, 2.5, false);
        Candy candy2 = new Candy("Airheads", 10, 5, true);
        Candy candy3 = new Candy("Brach's", 2, 10, false);
        Candy candy4 = new Candy("Jelly Belly", 8, 1.5, false);
        Candy candy5 = new Candy("M&M's", 10, 0, false);
        candyArrayList.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));
        for (Candy candy : candyArrayList) {
            System.out.println(candy.getBrand()+" Price is "+candy.getPrice());
            System.out.println(candy);
        }
    }
}
/*
  create a custom class named Candy
            private variables:
                brand (String), quantity (int), price (double), hasPeanuts (boolean)

            Encapsulate All the private fields
                    (price of candy can not be set to negative)
                    (quantity of candy can not be set to zero or negative)

            Add a constructor that can set the instances when the object is created
                    (avoid any duplicated code fragments)

            Extra methods:
                toString():
                    if the price is zero, print "free" instead of 0
 */