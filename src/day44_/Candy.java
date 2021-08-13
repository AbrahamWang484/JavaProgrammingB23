package day44_;

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
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
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