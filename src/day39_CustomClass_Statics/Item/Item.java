package day39_CustomClass_Statics.Item;

public class Item {
    public String name;
    public double price;
    public int quantity;

    public void setInfo(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

}
