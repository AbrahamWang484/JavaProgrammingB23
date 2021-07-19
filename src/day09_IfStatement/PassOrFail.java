package day09_IfStatement;

public class PassOrFail {
    public static void main(String[] args) {

            int score  = 50;  // for 2 options, use if...else

            if(score >= 60){
                System.out.println("Passed");
            }

            if(score<60){
                System.out.println("Failed");
            }

            System.out.println("-------------------------------------");

            if(score >= 60){
                System.out.println("Passed");
            }else{  // otherwise
                System.out.println("Failed");
            }

    }
}

