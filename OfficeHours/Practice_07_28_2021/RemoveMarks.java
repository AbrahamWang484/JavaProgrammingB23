package Practice_07_28_2021;

public class RemoveMarks {

    public static void main(String[] args) {

        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        //            01234567890
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase((str.charAt(i))))
                result += " ";

            if (Character.isAlphabetic((str.charAt(i))))
                result += str.charAt(i);
        }

        System.out.println(result.trim());


    }
}


/*
Task 1:
					String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

					Write a method that returns : Welcome To Core Java
 */