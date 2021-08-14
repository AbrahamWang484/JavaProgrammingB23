package Replit.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class twice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String target = scan.next();
        scan.nextLine();
        String sentence =scan.nextLine();

        if (appearsTwice(target,sentence)==false){
            System.out.println("Return "+ appearsTwice(target,sentence)+", because "+ target +" appears only once.");
        }else {
            System.out.println("Return "+ appearsTwice(target,sentence)+", because "+ target +" appears twice.");
        }

    }

    /**
     * target - string that you need to check.
     * sentence - string where you need to lookup for target.
     */
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        sentence = sentence.replaceAll("\\p{Punct}","");
        String[] str = sentence.split(" ");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(str));
        boolean hasTwice = (Collections.frequency(strList,target)==2)?true:false;
        return hasTwice;
    }
}
/*
# `Write a a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence, otherwise return false.`

`Examples:`

`Main.appearsTwice("java", "java is fun!")`

      `- returns false, because java appears only once.`

`Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")`

      `- returns true, because laptop appears twice.`

 */