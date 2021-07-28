package day36_ArrayList_Cont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        String target = "laptop";
        String sentence ="I would like to buy a new laptop, because my laptop is too old.";
       sentence = sentence.replaceAll("\\p{Punct}",""); // replace all the punctation by \\p{Punct}
        System.out.println(sentence);

        String[] str =sentence.split(" ");
        System.out.println(Arrays.toString(str) );
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(str));
        int frequency =Collections.frequency(strList,target);
        System.out.println(frequency);

//        boolean hasTwice = ((Collections.frequency(strList,target))=2)?true:false;
//        System.out.println(hasTwice);
    }
}


