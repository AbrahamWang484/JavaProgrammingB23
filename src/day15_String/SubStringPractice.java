package day15_String;

public class SubStringPractice {
    public static void main(String[] args) {

        String sentence ="My favorite TV series is The Walking Dead";
        String tvSeries =sentence.substring(25);

        System.out.println(tvSeries);

        System.out.println("-----------------------");

        String sentence2="Java is a fun language";
        String s1= sentence2.substring(10,12+1);
        System.out.println(s1);

        String s2= sentence2.substring(14);
        System.out.println("s2 = " + s2);

        System.out.println("-----------------------");
        String sentence3= "Python is an easy language";
        sentence3=sentence3.replace("Python","Java");
        //Java is an easy language.
        System.out.println("sentence3 = " + sentence3);

        String sentence4 ="C# is a programming language, I like learning C#, C# is the best";
        sentence4 = sentence4.replaceAll("C#","Java");
        System.out.println("sentence4 = " + sentence4);

        String sentence5 ="Dog is friendly, Dog is loyal, I love Dogs";
        sentence5 =sentence5.replace("Dog","Cat");
        System.out.println("sentence5 = " + sentence5);


        String str ="Batch 23";
       // char ch1=str.charAt(200); Error: out of range
        //char ch2= str.charAt(-1);Error: out of range














    }
}
