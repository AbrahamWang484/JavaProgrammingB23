package day23_Arrays;

public class WarmupTask2B {
    public static void main(String[] args) {
        String str = "aabcccd";

        //Step 1 get the remove duplicate string
        String removeDuplicate="";
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if (removeDuplicate.contains(""+each)){
                continue;
            }
            removeDuplicate+=each;
        }

        //step 2 : get each letter from removeDuplicate.string
        //Setp 3 : compare with orignal string, if equal, then ++
        //Step 4  : print the result
        String result="";
        for (int i = 0; i < removeDuplicate.length(); i++) {
            char each=removeDuplicate.charAt(i);
            int frequency=0;
            for (int j = 0; j < str.length(); j++) {
                char ch=str.charAt(j);
                if (each==ch)
                    frequency++;
            }
            result += ""+each+frequency;
        }
        System.out.println("result = " + result);


    }
}
/*
	2. find the frequency of each characters from a string

			str = "aabcccd";

			output:
				a2b1c3d1
 */
