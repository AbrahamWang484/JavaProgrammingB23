package day35_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicate {

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('b');
        list.add('b');
        list.add('b');
        list.add('c');
        list.add('c');
        list.add('d');

        System.out.println(list);

        ArrayList<Character> result = new ArrayList<>();

        for (Character character : list) {
            if (!result.contains(character))
               // !result.contains(character.get(i));
                result.add(character);
        }
        System.out.println(result);

        System.out.println("----------reverse--------------");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        System.out.println(nums);
        ArrayList<Integer> result1 = new ArrayList<>();
        for (int i = nums.size() - 1; i >= 0; i--) {
            result1.add(nums.get(i));
        }
        System.out.println(result1);

        System.out.println("-------equal(list)------------");
        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(20);

        System.out.println(n1 == n2); // false due to check the memory location
        System.out.println(n1.equals(n2));// true only check the content



    }

}
