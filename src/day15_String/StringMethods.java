package day15_String;

public class StringMethods {
    public static void main(String[] args) {
        String str ="Muhtar";

        char ch = str.charAt(0);
        System.out.println("ch = " + ch);

        String word ="Cybertek School";
        //index number01234567891011...
        char ch2 = word.charAt(11);
        System.out.println("ch2 = " + ch2);

        System.out.println("----------------");


        String word2="Java";
        //index numb  0123
        char ch3= word2.charAt(2);
        System.out.println("ch3 = " + ch3);

        System.out.println("----------------");

        String s1 ="Cybertek";
        int lastIndex =s1.length()-1;
        char firstCharacter = s1.charAt(0);
        char lastCharacter= s1.charAt(lastIndex);

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);

        System.out.println("----------------");

        String firstName ="John";
        String lastName = "King";
        String fullName = firstName +" "+lastName;
        String fullName2 =firstName.concat(" ").concat(lastName);// use .concat()
        //each concat() only use for once, if concat multiple times.
        System.out.println("fullName2 = " + fullName2); //John King

        System.out.println("----------------");
        String  s ="cybertek";
        s=s.toUpperCase();
        System.out.println(s); //CYBERTEK

        System.out.println("----------------");
        String s2="JAVA PROGRAMMING LANGUAGE";
        s2=s2.toLowerCase();
        System.out.println(s2);//"java programming language"

        System.out.println("----------------");
        String schoolName ="                Cybertek   School         ";
        schoolName=schoolName.trim();
        System.out.println(schoolName);

        System.out.println("----------------");




















    }
}
