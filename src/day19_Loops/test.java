package day19_Loops;

import java.util.*;

public class test {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


//        String a = "I love You!";
//        String reverse = "";
//        for (int j = a.length() - 1; j >= 0; j--) {
//            reverse += a.charAt(j);
//        }
//        System.out.println(reverse);

        String a= "aaabbbccc";
        //List<Character> list= new LinkedHashSet<Character>(Arrays.asList(a.toCharArray()));
        String[] arr= a.split("");
        Set<String> list= new LinkedHashSet<String>(Arrays.asList(arr));
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.addAll(list);
        System.out.println(arrayList);

        System.out.println("-----------------------");

        List<String> carList = new ArrayList<String>();
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Jaguar");
        carList.add("BMW");
        carList.add("Mini Cooper");
        Set<String> set = new LinkedHashSet<>(carList);
        carList.clear();
        carList.addAll(set);
        System.out.println(carList);

    }
}
