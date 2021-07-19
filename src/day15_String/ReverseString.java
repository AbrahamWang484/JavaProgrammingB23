package day15_String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your String");
        String word = scan.next();
        //String word ="Blank";//index number: 01234
        String result ="";
        if (word.length()>5){
            result="Too long";
        }else if (word.length()<5){
            result="Too short";
        }else {
            result +=word.charAt(4);//k
            result +=word.charAt(3);//kn
            result +=word.charAt(2);//kna
            result +=word.charAt(1);//knal
            result +=word.charAt(0);//knalB
            //result = ""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        }//          above"" will make the char convert to String
        System.out.println("result = " + result);
    }
}
