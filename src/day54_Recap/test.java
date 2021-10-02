package day54_Recap;

import java.util.*;

public class test {
    public static void main(String[] args) {
        String str="aaabbbbbccccc"; //>>a3b5c5

        Set<String> list =  new LinkedHashSet<String>(Arrays.asList(str.split("")));
        List<String> list1 = Arrays.asList(str.split(""));
        for (String element : list) {
            System.out.print(element+Collections.frequency(list1,element));
        }
       //
        // System.out.println("Collections.frequency(a, \"a\") = " + Collections.frequency(a, "a"));


        //str=new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString().replace(", ","")
          //      .substring(1).replace("]","");
       // list<String> a= Array.asList(str.split(""));
      //  System.out.println("str = " + str);
        //Collections.frequency()


    }
}
