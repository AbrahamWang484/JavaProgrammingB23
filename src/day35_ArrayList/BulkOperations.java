package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));//Arrays.asList return type is Collection DataType

        ArrayList<Integer> list = new ArrayList<>();
        //list.addAll(1,1,2,3,4,5,6,7,8,9);
        //>>.addAll: add the another list which same data type as list
        list.addAll(numbers);
        list.addAll(Arrays.asList(10, 11, 12, 13, 14, 15));

        System.out.println(list);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

        System.out.println("------------------------------------------------");
        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Dilem", "Fhilipp", "Abbos", "Abbos", "Abbos", "Atila", "Ekaterina", "Dilem", "Fhilipp", "Fhilipp"));

        System.out.println(students);//[Dilem, Fhilipp, Abbos, Abbos, Abbos, Atila, Ekaterina, Dilem, Fhilipp, Fhilipp]
        //>>.removeAll: remove all the matched data
        students.removeAll(Arrays.asList("Dilem", "Fhilipp", "Abbos"));

        System.out.println(students);//[Atila, Ekaterina]


        ArrayList<Integer> nums = new ArrayList<>();
        boolean a = nums.addAll(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 5, 6, 7, 8, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
        System.out.println("a = " + a);
        System.out.println(nums);

        // nums.removeAll(  Arrays.asList( 1 ) );
        //>>.retainAll remove all the elements which are not match with object
        nums.retainAll(Arrays.asList(1, 2)); // removes all the elements tht are not matching with 1 or 2
        System.out.println(nums);//[1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

        System.out.println("------------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Dilem", "Fhilipp", "Abbos", "Ahmet", "Andrei", "Gabil", "Aliya", "Atila"));

        System.out.println(employees);//[Dilem, Fhilipp, Abbos, Ahmet, Andrei, Gabil, Aliya, Atila]

        //  employees.removeAll( Arrays.asList("Ahmet", "Andrei"));
        employees.retainAll(Arrays.asList("Ahmet", "Andrei"));
        System.out.println(employees); //[Ahmet, Andrei]


        System.out.println("----------------------------------------------------------");
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Soda", "Milk", "Wine", "Beer", "Eggs", "Bread", "Water", "Apple", "Cherry", "Paper Towels"));

        //check if Soda, Wine, Beer all of the are contained in groceryList
        boolean r = groceryList.containsAll(Arrays.asList("Soda", "Wine", "Beer", "Coffee"));

        System.out.println("r = " + r); //r = false


        System.out.println("------------------------------------");

        ArrayList<String> l = new ArrayList<>();
        l.add("Enes");
        l.add("Akbor"); //{Enes, Akbor}
        l.add(1, "Alex"); //{Enes, Alex, Akbor}
        l.add(0, "Alp");  //{"Alp", Enes, Alex, Akbor}



    }
}
