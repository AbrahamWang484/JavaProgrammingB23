package day15_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String sentence ="Java Programming Language";

        String name = sentence.substring(0,3+1);
        System.out.println("name = " + name);

        String s2 = "Cybertek School";
        //index numbe0123456789...
        String name2=s2.substring(0,7+1);
        System.out.println("name2 = " + name2);
        //for substring, the 7th didnot included.

        String name3=s2.substring(9,14+1);
        System.out.println("name3 = " + name3);

        System.out.println("------------------");
        String sentence2 ="Java is a programming language";

        String name4=sentence2.substring(10);
        System.out.println("name4 = " + name4);

        String name5 = sentence2.substring(10,21);
        System.out.println("name5 = " + name5);
        String name6 =name4.substring(0,12);
        System.out.println("name6 = " + name6);













    }
}
