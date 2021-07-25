package day35;

public class tset {
    public static void main(String[] args) {
        String str ="cybertek";
        for (int i = 0; i < str.length(); i+=2) {
            System.out.print(str.charAt(i));
        }

        str=str.substring(2);
        int index=str.indexOf("You");
        System.out.println(index);
        System.out.println(str);

        double a = 0%3;
        System.out.println(a);
    }

}
