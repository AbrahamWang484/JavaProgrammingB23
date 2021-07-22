package day19_Loops;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String word = "abababababa";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (!result.contains("" + word.charAt(i))) {
                result += word.charAt(i);
            }
        }
        System.out.println("result = " + result);
    }
}
//get the unique letter, remove the duplicate characters
//to remove the duplicate characters: 1) By using for loop,
//2) If the result did not contains the character then concatenate to result
