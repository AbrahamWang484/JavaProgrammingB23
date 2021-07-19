package day32_MethodOverloading;

public class sum {


    public static void main(String[] args) {
        int r1=sum(1,2);
        int r2=sum(1,2,3);
        int r3=sum(1,2,3,4);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
    }
    public static int sum2Numbers(int a, int b) { return  a + b; }

    public static int sum3Numbers(int a, int b, int c) { return a + b + c; }

    public static int sum4Numbers(int a, int b, int c, int d) { return a + b + c + d; }

    //---------------------------Method Overloading------------------------------------
    public static int sum(int a, int b){return a + b;}
    public static int sum(int a, int b,int c){return a + b+c;}
    public static int sum(int a, int b,int c, int d){return a+b+c+d;}//return sum(sum(a,b)+ sum(c,d)); //return sum(sum(a,b,c)+ d );
    public static double sum(double a, double b){return a + b;}
    public static double sum(double a, double b,double c){return a + b+c;}
    public static double sum(double a, double b,double c, double d){return a + b+c+d;}
}/*
Task1:
    1. create a method that can find the sum of two numbers
                    method name: sumOf2Numbers
    2. create a method that can find the sum of three numbers
                    method name: sumOf3Numbers

    3. create a method that can find the sum of four numbers
                    method name: sumOf4Numbers
 */