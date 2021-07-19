package day16_String;

public class WebName {
    public static void main(String[] args) {
        String url ="www.amazon.com";
        int beginning =url.indexOf(".")+1;
        int ending =url.lastIndexOf(".");

        String name =url.substring(beginning, ending);
        String domain= url.substring(ending+1);
        System.out.println("name = " + name);
        System.out.println("domain = " + domain);
    }
}
//get the domain