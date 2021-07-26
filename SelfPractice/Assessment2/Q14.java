package Assessment2;

public class Q14 {
    public static void main(String[] args) {
        int a = 0;
        do {
            //  0   + 0  - 0 a=0
            //1       1  -  1  a=1
            //2      2   - 2  a =2
            //3    + 3  -0   a=6
            a= a++ + --a -(a %3);
        }while (++a <4) ;
        System.out.print(a);
    }
}
