package day21_Loops;

public class warnupTask3 {
    public static void main(String[] args) {
        String str="A1B2C3";
        int sum=0;
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            if (ch>='0'&& ch<='9'){
                sum+=ch-'0';
            }

        }
        System.out.println("sum = " + sum);

    }
}
/*

   3. Write a program that can return the sum of digits from a string
     		Ex:
     			input: A1B2C3

     			output:
     					6
 */
