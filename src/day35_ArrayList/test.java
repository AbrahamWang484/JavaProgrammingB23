package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> deliveries = new ArrayList<>();
        deliveries.addAll(Arrays.asList(1,2,3));
       // System.out.println(words);
        int total = 0;
        int sum = 0;
        int max_fuel =3;
        for (int i = 0; i < deliveries.size(); i++) {
            sum += deliveries.get(i);
        }
        if (sum % max_fuel == 0) {
            total = sum / max_fuel ;
        }else {
            total = sum / max_fuel +1;
        }
        System.out.println(total);
    }
}
//    ArrayList<String> list=new ArrayList<>();
//        for (int i = 0; i < words.size(); i+=2) {
//        list.add(words.get(i));
//        }