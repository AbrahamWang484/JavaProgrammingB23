package day21_Loops;

public class warmupTask4 {
    public static void main(String[] args) {
        String str="mn@#123Ab!";
        String result1="letters: ";
        String result2="digits: ";
        String result3="special chars: ";

        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if ((each>='A'&& each<='Z')||(each>='a'&& each<='z')){
                result1+=each;
            }else if (each>='0'&& each<='9'){
                result2+=each;
            }else {
                result3+=each;
            }

        }System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
/*
	4. write a program that can retrieve the digits, letters and special characters from a string
			Ex:
				input:
					mn@#123Ab!

				output:
					letters: mnAb
					digits: 123
					special chars: @#!
 */
