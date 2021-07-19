package day21_Loops;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        int a=5, b=-3, result=0;

        if (b<0){
            a*=-1;b*=-1; //in for loop, b must >0, so *(-1) will become positive
        }

        for (int i = 0; i < b; i++) {
            result+=a;
        }
        System.out.println(result);

    }
}
/* a. give pre-setting; b.use for loop to create multiple addition
1. write a program that can multiply two numbers without using * operator
 */