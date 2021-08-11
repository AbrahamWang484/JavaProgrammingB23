package Practice_08_11_2021;

import java.util.ArrayList;

public class Category {
    public String name;
    public ArrayList<Product> products;
    public static String companyName;
    public static double totalEarnings;

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, ArrayList<Product> products) {
        this(name);
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                ", companyName='" + companyName + '\'' +
                ", totalEarnings=" + totalEarnings +
                '}';
    }

    public ArrayList<Product> addProduct(Product product){
       products.add(product);
       return products;
    }
    public ArrayList<Product> addProduct(ArrayList<Product> product){
        products.addAll(product);
        return products;
    }

}
/*
Create a class called Category

		Instance Variables :
			- name(String) , ArrayList<Product> products

		Constructor  	   :
			- One Parameter (String name) -> Use this() to call All Arg Constr
			- Two parameter (String name,ArrayList<Product> products)

		Static Variables   :
			- companyName
			- totalEarnings

		Instance Methods   :
			- toString - > returns information about Category

			- addProduct(Product product)->Adds given product quantity to the arrayList products
			- addProduct(ArrayList<Product> product)->Adds given products quantity to the arrayList products

				NOTE: Before adding check this product exist or not

					  if it is exist ;
					  	- if prices are same, increase quantity otherwise give an error message
					  	  	ERROR :Check $product price

					  if it is not exist ;
					  	- Add product/products in arrayList(products)


			- sellProduct(Product product) ->Removes given product quantity from the arrayList products

			- sellProduct(ArrayList<Product> product)->Removes given product quantity from the arrayList products

				NOTE: Before sell product check productList

					  if it is exist ;
						  	- if quantity is enough to sell, sell it
						  		Update quantity,
						  		increase totalEarnings   ( totalEarnings = quantity*price)

						  	- if quantity is not enough to sell
						  		ERROR : Quantity is not enough to sell

					  if it is not exist ;
					  	- ERROR : There is no product to sell


 */