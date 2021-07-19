package day21_Loops;

public class WhileLoopPractice2 {
    public static void main(String[] args) {

        int i = 1; //intinitiall
        while(i <= 10){ //condition
            if(i%2 ==0) {
                System.out.print(i + " ");
            }

            i++; //de-incremental
        }

        System.out.println();

        System.out.println("------------------------------");

        for (int j = 1; j <= 10; j++) {
            if(j%2 ==0) {
                System.out.print(j + " ");
            }
        }

    }
}
