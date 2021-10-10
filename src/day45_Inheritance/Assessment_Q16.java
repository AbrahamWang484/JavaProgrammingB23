package day45_Inheritance;

public class Assessment_Q16 {
    public static void main(String[] args) {
        double number = add(3.4);

        number+= add ("dual");//2.5+10
        number+= add(Integer.parseInt("100"));//12.5+5=17.5
        number+= add(11341L);//17.5+2.5
        number+= add(Float.parseFloat("50.8"));//17.5+2.5 +2.5 =22.5
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
