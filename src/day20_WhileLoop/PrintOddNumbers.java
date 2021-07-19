package day20_WhileLoop;

public class PrintOddNumbers {
    public static void main(String[] args) {

//print the odd numbers bw 1-10, must use continue;
        for (int i=1;i<11; i++){
            if (i%2==0){ // if the number i is even number
                continue;//skip
            }
            System.out.println(i);
        }
        System.out.println("-------------------");
        // print all thee numbers bw 1-100, which are evenly divisible by 3 & 5
        for (int i= 1; i<=100; i++){
            if (i % 15 != 0){
                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("-------------------");
        //print all letters bw A--Z,except for D T X
        for (char i='A';i<='Z';i++){

            if (i =='D' ||i == 'T'|| i=='X'){
                continue;
            }
            System.out.print(i+" ");
        }











    }
}
