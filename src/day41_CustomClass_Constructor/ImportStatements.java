package day41_CustomClass_Constructor;

import utilities.Data;


import static utilities.Data.str3;
import static utilities.Data.str4;
import static utilities.Data.str5;
import static utilities.Data.method3;
import static utilities.Data.method4;


import static utilities.Data.*;

public class ImportStatements {

    public static void main(String[] args) {
        /*
        Data obj = new Data();
        System.out.println(obj.str1);
        System.out.println(obj.str2);
        System.out.println(Data.str3);
        System.out.println(Data.str4);
        */
        System.out.println("--------------------------------");

        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        method3();
        method4();



    }

}
/*
class Data{
    int a, b;
    static int c, d;
}
 */