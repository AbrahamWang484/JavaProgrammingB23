package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Milk");
        groceryList.add("Water");
        groceryList.add("Viniger");
        groceryList.add("Bread");

        System.out.println(groceryList);//[Eggs, Milk, Water, Viniger, Bread]
        //.set(index, object): replaces the old element at given index with new element
        groceryList.set(0, "Toilet Paper"); //replace
        groceryList.set(3, "Soda");

        System.out.println(groceryList);//[Toilet Paper, Milk, Water, Soda, Bread]

        boolean hasToiletPaper = groceryList.contains("Toilet Paper");
        boolean hasToiletPaper2 = groceryList.indexOf("Toilet Paper") >=0 ;

        System.out.println("hasToiletPaper = " + hasToiletPaper);
        System.out.println("hasToiletPaper2 = " + hasToiletPaper2);

        System.out.println("-----------------------------------------------------");
        // remove(index):
        groceryList.remove(1);
        System.out.println(  );//[Toilet Paper, Water, Soda, Bread]

        //remove(Object)
        boolean r1 = groceryList.remove("Water");
        System.out.println(groceryList);//[Toilet Paper, Soda, Bread]
        System.out.println("r1 = " + r1);

        boolean r2 = groceryList.remove("Face Masks");

        System.out.println(groceryList);//[Toilet Paper, Soda, Bread]
        System.out.println("r2 = " + r2);

        System.out.println("--------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10); //0
        list1.add(20); //1
        list1.add(30); //2
        list1.add(40);//3
        list1.add(50); //4


        list1.remove( (Integer) 30 );

        System.out.println(list1);//[10, 20, 40, 50]

        //System.out.println( (double)10);

        groceryList.clear();
        System.out.println("groceryList = " + groceryList);//[]

        list1.clear();
        System.out.println("list1 = " + list1);//[]

        System.out.println("-----------------------------------------");

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('A');
        list.add('D');
        list.add('C');

        System.out.println(list);//[A, A, A, B, A, D, C]

        //    list.indexOf('B'); //3
        //   list.lastIndexOf('B'); //3

        ArrayList<Character>  uniqueChars = new ArrayList<>();

        for (Character each : list) {
            if(list.indexOf(each) == list.lastIndexOf(each)){
                uniqueChars.add(each);//result = [A, B, C]
            }
        }

        System.out.println("uniqueChars = " + uniqueChars);

        System.out.println("----------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('C');

        System.out.println(characters);//[A, B, C]

        ArrayList<Character> result = new ArrayList<>();

        for (int i=0; i < characters.size(); i++) {
            if(!result.contains(characters.get(i))){
                result.add(characters.get(i));
            }
        }

        System.out.println("result = " + result); //result = [A, B, C]

        System.out.println("------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        System.out.println(nums);//[100, 200, 300, 400]
        ArrayList<Integer> result2 = new ArrayList<>();

        for (int i = nums.size() - 1; i >= 0; i--) {
            result2.add( nums.get(i) );       //400, 300, 200, 100
        }

        System.out.println("result2 = " + result2);//result2 = [400, 300, 200, 100]

        System.out.println("-----------------------------------------------------");
        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(20);

        System.out.println(n1 == n2);//false  check the memory location & value
        System.out.println(n1.equals(n2));//true only check the content

        ArrayList<Character> s = new ArrayList<Character>();

        ArrayList<Integer> s1 = new ArrayList<Integer>();

        System.out.println(s1.equals(s));

    }



}
