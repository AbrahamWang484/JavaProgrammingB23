package day09_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        int score = 89;

        if (score >=90 && score <= 100){
            System.out.println("Your grade is: A");
        }else if (score >= 80){
            System.out.println("Your grade is: B");
        }else if (score >=70){
            System.out.println("Your grade is: C");
        }else if (score >=60){
            System.out.println("Your grade is: D");
        }else if (score < 60){
            System.out.println("Your grade is: F");
        }

    }
}
/*
 3. GradeReport
            A: 90 ~ 100
            B: 80 ~ 89
            C: 70 ~ 79
            D: 60 ~ 69
            F:  <60
 */