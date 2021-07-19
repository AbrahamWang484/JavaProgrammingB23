package Practice_06_09_2021;

public class AlphabetOrNot {
    public static void main(String[] args) {
        char letter='a';
        if((letter>='a' && letter<='z')||(letter>='A'&& letter<='Z')){
            System.out.println("Your letter is in alphabet");
        }else{
            System.out.println("Your letter is not in alphabet");
        }
    }
}
/*
 Create  program to check whether a character is an alphabet or not
 An input character is an alphabet if it lies in between a-z or A-Z.

 INPUT : '.'            EXPECTED : Your letter is not in alphabet

INPUT : 'a'            EXPECTED : Your letter is in alphabet
 */
