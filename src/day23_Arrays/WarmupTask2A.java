package day23_Arrays;

public class WarmupTask2A {
    public static void main(String[] args) {
        String str = "aabcccd";

        //Step 1:::remove the duplicate letter, finally output is String>>String = abcd
        String removeDuplicate = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (removeDuplicate.contains("" + each)) { //how to convert char to String
                continue;
            }
            removeDuplicate += each; //removeDuplicate =abcd

        }

        System.out.println("removeDuplicate = " + removeDuplicate);

        //Step 2::get the String result String = a1b2c3d1;
        //1)get each character from Step 1 removeDuplicate String.
        //2)compare each character with the original String, if equals,then ++
        String result = "";
        for (int j = 0; j < removeDuplicate.length(); j++) {
            char each = removeDuplicate.charAt(j);
            int frequency=0;
            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i);// get the each letter
                if (eachChar == each)
                    frequency++;

            }
            result += "" + each + frequency;
        }
        System.out.println(result);

    }
}
/*
2. find the frequency of each characters from a string

			str = "aabcccd";

			output:
				a2b1c3d1
 */