package day29_ReturnMethods;

public class removeDuplicate {
    public static void main(String[] args) {
        String str = "AAAABBBBCCCDFGEEDSDCHFFD";
        String result=removeDuplicate(str);
        System.out.println(result);
    }

    public static String removeDuplicate(String str) {
        String result = "";

//        for (int i = 0; i < str.length(); i++) {
//                if (!result.contains(""+str.charAt(i))){
//                    result+=str.charAt(i);
//                }
//        }
        //Method2:
//        for (char character : str.toCharArray()){
//            if (!result.contains(""+character)){
//                result+=character;
//            }
//        }
        //method 3:
        for (String each : str.split("")) {
            if (!result.contains(each)) {
                result += each;
            }
        }
        return result;
    }

}
/*
removeDuplicates:
        "AABBBBCCCCCC"
        "ABC"
isAnagram:
    create a function that can check if two strings are anagram, return true if they are anagram
    isAnagram("listen", "silent") ===> true
    isAnagram("Java", "C#")   ===> false
 */