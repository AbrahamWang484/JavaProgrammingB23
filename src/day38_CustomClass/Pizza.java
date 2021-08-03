package day38_CustomClass;

public class Pizza {
    public char size;
    public int numberofCheeseTopping, numberofPepperoniTopping;
    public double cost;

    public void customOrder(char size, int numberofCheeseTopping, int numberofPepperoniTopping) {
        this.size = size;
        this.numberofCheeseTopping = numberofCheeseTopping;
        this.numberofPepperoniTopping = numberofPepperoniTopping;
    }

    public double calcCost() {
        double startingPrice =(size =='S')?10:(size =='M')?12:14;
        double priceOfToppings = 2 * (numberofCheeseTopping+ numberofPepperoniTopping);
        return (startingPrice+priceOfToppings)*1.08;//tax
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberofCheeseTopping=" + numberofCheeseTopping +
                ", numberofPepperoniTopping=" + numberofPepperoniTopping +
                ", total cost= &" + calcCost() +
                '}';
    }
}



