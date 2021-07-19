package day21_Loops;

public class LetterDigitSpeicalChar {
    public static void main(String[] args) {
        String input = "mn@#123/Ab!";
        String letters = ""; //mnAb
        String digits = "";//123
        String specialChars = "";//@#

        for (int i = 0; i <= input.length() - 1; i++) {
            char each = input.charAt(i);
            if (each >= 'A' && each <= 'Z') { //if the character is upper case letter
                letters += each;
            } else if (each >= 'a' && each <= 'z') {//if the character is lower case letter
                letters += each;
            } else if (each >= '0' && each <= '9') {//if the character is digit numbers
                digits += each;
            } else {
                specialChars += each;//if the character is special Characters
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}

/*a.use loop to check each character from String. b. use if statement to filter out the target data.c. concatenation with prints
	4. write a program that can retrieve the digits, letters and special characters from a string
			Ex:
				input:
					mn@#123Ab!

				output:
					letters: mnAb
					digits: 123
					special chars: @#!
 */