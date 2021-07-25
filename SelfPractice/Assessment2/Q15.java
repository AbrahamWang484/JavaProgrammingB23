package Assessment2;

public class Q15 {
    public static void main(String[] args) {
        String str = "The whole time it was raining.";
                    //0123456789
        //[The[ wh[ole[ ti[me [it [was[ ra[ini[ng.
        do {
            System.out.print(str.charAt(0));
            str =str.substring(3);
        } while (!str.isEmpty());
    }
}
