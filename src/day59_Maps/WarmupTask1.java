package day59_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class WarmupTask1 {
    public static void main(String[] args) {
        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));


        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
           if (entry.getValue().getYear()<2015){
             //  entry.getValue().isBefore(LocalDate.of(2015,1,1))  same function as before
               System.out.println("Following is hired before 2015:" + "\n"+entry.getKey()+"::"+entry.getValue());
           }
        }
        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
            // 2. display the name of the employee who were hired on 5/15/2020
            if (entry.getValue().isEqual(LocalDate.of(2020,5,15))){
                System.out.println("Following is hired on 2020/5/15:" + "\n"+entry.getKey()+"::"+entry.getValue());
            }
        }
        int count=0;
        for (LocalDate value : map.values()) {
            if (value.isAfter(LocalDate.of(2014,12,31))){
                count++;
            }
        }
        System.out.println(count);

        for (String k : map.keySet()) {
            System.out.println(k+"::" + map.get(k));// get k's value
        }

    }
}
/*
task 1:
    Given:
         Map<String, LocalDate> map = new LinkedHashMap<>();
            map.put("John", LocalDate.of(2018, 9, 5));
            map.put("Antony", LocalDate.of(2012, 7, 29));
            map.put("Jimmy", LocalDate.of(2014, 4, 1));
            map.put("James", LocalDate.of(2016, 11, 2));
            map.put("Josh", LocalDate.of(2020, 5, 15));
            map.put("Cory", LocalDate.of(2015, 6, 19));
            map.put("Anderson", LocalDate.of(2013, 8, 24));
            map.put("Steven", LocalDate.of(2017, 10, 2));

        1. Display the names of the employee who were hired before 2015
        2. display the name of the employee who were hired on 5/15/2020
        3. How many people were hired after 2014?
        4. display the name and hire date of the employee
 */