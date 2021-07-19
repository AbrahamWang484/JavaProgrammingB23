package day22_Recap;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 10;
        //while loop first check the condition,if true, will execute the statement
        while(i<5){
            System.out.println("Hello World!");
        }

        System.out.println("-----------------------");
        //do while loop will first execute one time the Statement, then check the condition,if condition is true, will repeat
        do{
            System.out.println("Hello World!");
        }while (i<5);

        //even if the condition is false, do-while loop gets executed one time

        //interview question: whats the difference bw while loop && do-while loop
    }
}
