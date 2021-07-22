package day18_Recap;

public class indexOfPractise {
    public static void main(String[] args) {
         String str ="abcd";
         int indexOfK =str.indexOf("k");

        System.out.println("indexOfK = " + indexOfK); //-1
        if (indexOfK>=0){
            System.out.println("the string has character k");
        }else {// index of k will be negative means doesnot contain the k
            System.out.println("the string does not have k");
        }
        System.out.println("------------");

        String sentence ="I like to learn C#, C# is cool J";
        //verify if the sentence has "Java"
        if (sentence.indexOf("Java")>=0){
            System.out.println("Sentence has java");
        }else {
            System.out.println("Sentence does not have Java");
        }

        System.out.println("------------");

        String sentence2 ="I love Java, Java is cool";

        boolean isUnique=sentence2.indexOf("Java")==sentence2.lastIndexOf("Java");
        if (isUnique){
            System.out.println("its unique");
        }else {
            System.out.println("not unique");
        }

        System.out.println("------------");
        String sentence3 ="I love Java, C# is cool";

        boolean isUnique1=sentence3.indexOf("Java")==sentence3.lastIndexOf("Java");
        if (isUnique1){
            System.out.println("its unique");
        }else {
            System.out.println("not unique");
        }
        //if indexOf = negative number, so means not include

        System.out.println("------------");

        String schoolName= "Cybertek School";
        String name=schoolName.substring(0,schoolName.indexOf(" "));
        System.out.println(name);

        System.out.println("------------");
        String sentence4 = "I live in CA,I go to Cybertek school";
        String name2= sentence4.substring(sentence4.indexOf("Cy"), sentence4.lastIndexOf(" "));
        //for unique the Indexof, you can add more characters, but compiler will checking from left to right,
        //then display first character
        System.out.println("name2 = " + name2);

        System.out.println("------------");

        String str2="Dog Cat Dog Cat";
        System.out.println(str2);
        str2=str2.replace("Cat","Dog");//Dog Dog Dog Dog
        System.out.println(str2);

        str2= str2.replaceFirst("Dog","Cat");
        System.out.println(str2);

        String sentence5 ="Java Java Java";
        //String sentence6 =sentence5.replaceFirst("Java","C#").replaceFirst("Java","Python");// C# Java Java
        sentence5= sentence5.replace("Java Java ","C# Python ");

        System.out.println(sentence5);
        //System.out.println(sentence6);

        System.out.println("------------");

        System.out.println("Yes".equals("yes"));//false
        System.out.println("Yes".equalsIgnoreCase("yes"));//true
        System.out.println("YES".equalsIgnoreCase("no"));//false






    }
}
