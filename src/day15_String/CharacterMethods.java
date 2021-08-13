package day15_String;

public class CharacterMethods {

        public static void main(String argu[]) {
            System.out.println(Character.isLetter('g')); // true
            System.out.println(Character.isLetter('6')); // false
            System.out.println(Character.isDigit('8')); // true
            System.out.println(Character.isWhitespace('\t')); // true
            System.out.println(Character.isUpperCase('k')); // false
            System.out.println(Character.isLowerCase('G')); // false
            System.out.println(Character.toUpperCase('d')); // D
            System.out.println(Character.toLowerCase('K')); // k
            System.out.println(Character.toString('S')); // S
        }


}
/*
Predefined Methods of Character Class

isLetter(): It checks whether the particular character value is a letter or not
isDigit(): It checks whether the specific character value is a digit or not.
isWhitespace(): It checks whether the particular character value is a white-space or not. White-space comes with three things:
spaces
tab and
new-line
isUpperCase(): It checks whether the specific character value is in uppercase or not.
isLowerCase(): It checks whether the particular character value is lowercase or not.
toUpperCase(): This method is used to convert to the upper-case letter by returning the uppercase form of the specified char value.
toLowerCase(): This method is used to convert the specific letter to lower-case letter by returning the lowercase form of the specified char value.
toString(): It used to returns a String object representing the specified character value.
 */