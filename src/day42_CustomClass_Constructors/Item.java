package day42_CustomClass_Constructors;

public class Item {
    public String name;
    public int quantity;
    public double unitPrice;

    public Item(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double calcCost(){
        return quantity*unitPrice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
/*
1. Create a class called Item
            Variables:
                name, unitPrice, quantity
            Add a constructor to initialize all the fields
            Methods:
                calcCost(): returns the total price of the Item
                toString()
 */