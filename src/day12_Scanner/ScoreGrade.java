package day12_Scanner;

import java.util.Scanner;

public class ScoreGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        int score = input.nextInt();
        input.close();

        if (score<=100 && score>=0){
            if (score>=90){
                System.out.println("A");
            }else if (score>=80){
                System.out.println("B");
            }else if (score>=70){
                System.out.println("C");
            }else if (score>=60){
                System.out.println("D");
            }else {
                System.out.println("F");
            }
        }

        System.out.println("---------Ternary------------");
        String result ="";
        if (score<= 100 && score>=0){
            result =(score >=90 && score <=100)?"A":(score >=80)?"B":(score >=70)?"C":(score>=60)?"D":"F";
        }
        System.out.println("result = " + result);
    }
}
/*
GradeReport: score  grades: A, B, C, D, F
             >=90     A
             >=80     B
             >=70     C
             >=60     D
             <60      F
  System.out.println("Enter SCORE");
        int grade = score.nextInt();
        String result = "";

        System.out.println(result);
        }else{
            System.out.println("Better study for the next exam!");
        }
        System.out.println("********TERNARY********");

        System.out.println("Enter SCORE.");
        int grade1 = score.nextInt();

        System.out.println( (grade1 >= 90 && grade1 <= 100)? "A":
                (grade1 >= 80)? "B":(grade1 >= 70)? "C":
                        (grade1 >= 60)? "D":"F");
 */