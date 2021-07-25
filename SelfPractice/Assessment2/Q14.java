package Assessment2;

public class Q14 {
    public static void main(String[] args) {
        int a = 0;
        do {
            a= a++ + --a -(a %3);
        }while (++a <4) ;
        System.out.print(a);
    }
}
