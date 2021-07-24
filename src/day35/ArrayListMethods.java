package day35;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Water");
        groceryList.add("Milk");
        groceryList.add("Soda");
        groceryList.add("Bread");
        groceryList.add("Paper");

        System.out.println(groceryList);

        System.out.println("------------------");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        System.out.println("---------------------");

        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('a');
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('c');
        list.add('d');
        list.add('e');
        System.out.println(list);

        list.indexOf('a');
        list.lastIndexOf('a');
        ArrayList<Character> uniqueChars  = new ArrayList<>();
        for (Character each : list) {
            if (list.indexOf(each)==list.lastIndexOf(each))
                uniqueChars.add(each);

        }
        System.out.println("uniqueChars = " + uniqueChars);


    }



}
