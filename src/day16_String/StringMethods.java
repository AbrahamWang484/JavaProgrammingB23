package day16_String;

public class StringMethods {
    public static void main(String[] args) {
        String sentence = "Java is a cool language";
        int indexOfFirstA = sentence.indexOf("a");
        int indexOfSecondA = sentence.indexOf("a ");
        int indexOfThirdA = sentence.indexOf("a c");
        int indexOfFourthA = sentence.indexOf("ang");//by using the unique characters combine, you will find the a's Index Number
        int indexOfFifthA = sentence.indexOf("ag");
        int indexofFifthA1 = sentence.lastIndexOf("a");



        System.out.println(indexOfFirstA);
        System.out.println(indexOfSecondA);
        System.out.println(indexOfThirdA);
        System.out.println(indexOfFourthA);
        System.out.println(indexOfFifthA);
        System.out.println(indexofFifthA1);

        String s2="      ";
        s2 = s2.trim();
        boolean r1 =s2.isEmpty();//empty() will return the boolean
        System.out.println("r1 = " + r1);


        System.out.println("-------------------------------------------");
        String str1 = "Cat";//string pool
        String str2 = new String("Cat");// java heap location 1
        String str3 = new String("Cat");// java heap location 2

        System.out.println(str1 == str2);//location, objects are totally different false
        System.out.println(str1.equals(str2));//compare the content true
        System.out.println(str2.equals(str3));//true
        System.out.println(str2==str3); //false

        System.out.println("-------------------------------------------");
        String word1 ="Java";
        String word2="java";

        System.out.println();


    }
}
