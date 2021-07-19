package day16_String;

public class Replacement {
    public static void main(String[] args) {
        String email ="Cybertek@yahoo.com";
        email= email.replace("yahoo","gmail");
        //.replace() will replace all
        System.out.println(email);

        String sentence = "C# is cool, C# is fun";
        sentence =sentence.replace("C#","Java");
        System.out.println(sentence);

        String sentence1 = "C# is cool, C# is fun";
        sentence1 = sentence1.replaceFirst("C#","Java");
        //.replaceFirst will replace first matching word





    }
}
