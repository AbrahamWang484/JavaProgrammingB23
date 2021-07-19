package day14_Recap;

public class LetterOrDigitOrSpecialChar {
    public static void main(String[] args) {

        char ch ='0';

        boolean isDigit = ch>='0'&& ch<='9';

        boolean isLetter = (ch>='a'&& ch<='z') ||(ch>='A'&& ch<='Z');

        boolean isSpecialCharacter = !isDigit && !isLetter;

        if(isDigit){
            System.out.println("Your input is digit."); //resut =ch +"digit"; here you need first define the String result=""
;        } else if (isLetter) {
            System.out.println("Your input is letter.");//result =ch +"letter;
        }else {
            System.out.println("Your input is special character.");//result =ch +"special character
        }
        // String result =(isDigit)? "digit":(isLetter)?"letter":"special Character.
        //Ternary mothed
    }
}
/*
Given a  char variable determine if the character is letter or digit or special character.
            Ex: 'b'  --> letter
                '9'  --> digit
                '!'  --> special character
 */
