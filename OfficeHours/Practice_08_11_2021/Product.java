package Practice_08_11_2021;

public class Product {
    public String name;
    public int quantity;
    public double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
/*
Create a class called Product

		Instance Variables :
			- name (String), quantity(int),price(double)
		Instance Methods   :
			- toString - > returns information about Product
		Constructor  	   :
			- All Arg Constructor
 */