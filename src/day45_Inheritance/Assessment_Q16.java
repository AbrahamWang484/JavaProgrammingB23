package day45_Inheritance;

public class Assessment_Q16 {
    public static void main(String[] args) {
        double number = add(3.4);

        number+= add ("dual");
        number+= add(Integer.parseInt("100"));
        number+= add(11341L);
        number+= add(Float.parseFloat("50.8"));
        System.out.println(number);
        //11341L;
        System.out.println(11341L);
    }
    public static int add(int n){
        return 5;
    }
    public static double add(double n){
        return 2.5;
    }
    public static long add(String n){
        return 10;
    }

}
