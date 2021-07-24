package day35;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9)); //Arrays.asList convert array to collection
        list.addAll(numbers);

        ArrayList<String> students = new ArrayList<>();
        students.add("Yuliang");
        students.addAll(Arrays.asList("Dilem","Aboos","Atila","Wang"));
        System.out.println(students);

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.addAll(Arrays.asList(1,1,1,1,12,2,2,2,2,3,3,3,4,4,4,4,5,5,5,5,6,6,6));
        System.out.println(n1);
       // n1.removeAll(Arrays.asList(1,2,3,4,5,6));//removes all the matching elements from the arrayList
        n1.retainAll(Arrays.asList(1,2));//removes all the non-matching elements from the arraylist
        System.out.println(n1);

        System.out.println("----------removeAll()--------");
        ArrayList<String> employee= new ArrayList<>();
        employee.addAll(Arrays.asList("Dilem","Aboos","Atila","Wang","Ahmet","Andrei","Dilem"));
        employee.retainAll(Arrays.asList("Wang","Ahmet"));
        System.out.println(employee);

        System.out.println("-------containsAll()---------------");
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Soda","Apple","Beer","Wine","Beef","Egg"));

       boolean r1 = groceryList.containsAll(Arrays.asList("Soda","Wine","Beer"));
        System.out.println("Are content has Soda,Wine,Beer"+r1);
        boolean r2 = groceryList.containsAll(Arrays.asList("Coffee"));
        System.out.println("Are content has Coffee"+r2);



    }
}
