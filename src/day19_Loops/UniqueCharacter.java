package day19_Loops;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "aabbc";
        String result = "";

        //boolean isUnique= str.indexOf('a')==str.lastIndexOf('a');
        //if is true, unique; false duplicates
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);//a,a,b,b,c
            boolean isUnique = str.indexOf(ch) == str.lastIndexOf(ch);
            if (isUnique) { //if isUnique is true, then processed
                result += ch;
            }
        }
        System.out.println("result = " + result);
    }
}
//remove duplicates  by: boolean method
                      // boolean isUnique = str.indexOf(ch) == str.lastIndexOf(ch);