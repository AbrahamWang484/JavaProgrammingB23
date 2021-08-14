package Replit.String;

import java.util.Scanner;

public class SMSmessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
//String str = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
        //write your codes here:
        String sender;
        String phoneNumber;
        String messageBody;

        int index_angleBrackets_left = message.indexOf("<");
        int index_angleBrackets_right = message.indexOf(">");
        int index_openBrackets_left = message.indexOf("[");
        int index_openBrackets_right = message.indexOf("]");
        int index_curlyBrace_left = message.indexOf("{");
        int index_curlyBrace_right = message.indexOf("}");

        sender =message.substring(index_angleBrackets_left+1,index_angleBrackets_right);
        phoneNumber=message.substring(index_openBrackets_left+1,index_openBrackets_right);
        messageBody=message.substring(index_curlyBrace_left+1,index_curlyBrace_right);

        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);

    }

}
/*
Given a String **message** in the following format:
` Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}`
assign the value of the **sender, phoneNumber, and messageBody** variables and print them.

```
Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */
