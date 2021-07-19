package day10_IfStatements;

public class Ternary_practice {
    public static void main(String[] args) {
        int age =23;
        String result = (age>=21)?"Eligible":"not eligilbe";
        //String result ="";
        /*
        if (age>=21){
            result = "Eligible";
        }else {
            result ="not eligible";
        }
        */
        System.out.println(result);

        int score = 70;
        System.out.println((score>=60)?"Passed":"Failed");


        System.out.println("------------");

        int number =100;
        /*
        String reult = "";
        if (number>0)
            (number<0)
        (number==0) */

        String result1 = (number>0)? "Postive":(number<0)?"Negative":"Zero";
        System.out.println("result1 = " + result1);

        System.out.println("------------------");
        int score1 =100;
        /*
        char grade = ' ';
        if(score1>=90){
            grade = 'A';
        }else if (score1>= 80){
            grade = 'B';
        }else {
            grade = 'c';
        }
        */
        char grade = (score1 >= 90)?'A':(score1 >= 80)?'B':(score1 >= 70)?'C':(score1 >= 60)?'D':'F';
        System.out.println("grade = " + grade);
    }
}
