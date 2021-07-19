package day33_Methods;

public class RemoveDup {
    public static String removeDup(String str){

        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(""+str.charAt(i)))
                result+=str.charAt(i);
        }

        return result;
    }
    public static String[] removeDup(String[] array){
//step 1: creat new array which without duplicate.
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(""+str.charAt(i)))
                result+=str.charAt(i);
        }

        return result;
    }
}
/*
Task4:
    1. create a method that can remove the duplicates from an array of integer
        Ex:
          int[] array = {1,1,1,2,2,2,3,4,5,5,5};
          removeDup(array);  ===> {1,2,3,4,5}

    2. create a method that can remove the duplicates from an array of double

    3. create a method that can remove the duplicates from an array of String

    4. create a method that can remove the duplicates from an array of char
        HINT: how did you remove the duplicates from a string?
 */