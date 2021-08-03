package day38_CustomClass;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class OrderPizza {
    public static void main(String[] args) {
        Pizza order1 = new Pizza();
        order1.customOrder('S',1,1);
        Pizza order2 = new Pizza();
        order2.customOrder('M',2,2);
        Pizza order3 = new Pizza();
        order3.customOrder('L',1,3);
        Pizza order4 = new Pizza();
        order4.customOrder( 'L',2,4);
        Pizza order5 = new Pizza();
        order5.customOrder('S',4,2);

        order1.calcCost();
        System.out.println(order1);
        order2.calcCost();
        System.out.println(order2);

        ArrayList<Pizza> pizzas =new ArrayList<>();
        //add 30 M sized pizza with 2 cheese topping , 2 pepperoni toppings
        for (int i=1; i<=30;i++){
            Pizza pizza = new Pizza();
            pizza.customOrder('M',2,2);
            pizzas.add(pizza);
        }
        //add 80 large pizza with
        for (int i = 1; i <= 80; i++) {
            Pizza pizza = new Pizza();
            pizza.customOrder('L',3,4);
            pizzas.add(pizza);

        }

        for (int i = 1; i <= 38; i++) {
            Pizza pizza =new Pizza();
            pizza.customOrder('S',2,1);
            pizzas.add(pizza);
        }
        System.out.println(pizzas.size());

        double sum=0;
        for (Pizza pizza : pizzas) {
            sum+=   pizza.calcCost();
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(sum));
    }
}
