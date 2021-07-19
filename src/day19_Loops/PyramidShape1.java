package day19_Loops;

public class PyramidShape1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){ // outer loop decide the how many lines
            for(int j=1;j<=i;j++){ // inner loop decide the how many stars print in one line
                System.out.print("* ");
            }
            System.out.println();//new line
        }
        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */
        System.out.println("----------------");

        int term=6;
        for(int i=1;i<=term;i++){
            for(int j=term;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
        /*
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
    }

}
