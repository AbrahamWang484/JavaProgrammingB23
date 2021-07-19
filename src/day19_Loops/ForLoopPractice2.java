package day19_Loops;

public class ForLoopPractice2 {
    public static void main(String[] args) {

        for (char i='A';i<='Z';i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------");

        for (char i='Z';i >='A';i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------");

        for(char i =1000;i<=30000;i++){
            System.out.print(i+" ");
        }
    }
}
