package Replit.Methods;

import java.util.Scanner;

public class ProfitOrLoss {
    public static String profits(int buyPrice,int sellPrice){
        //your code here
        if (sellPrice>buyPrice){
            return "profit";
        }else if (sellPrice<buyPrice){
            return "loss";
        }else {
            return "no loss";
        }



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
    }
}
/*
Finish the **profits** method which accepts the `buyPrice`(int) and `sellPrice`(int) and determines if there was a profit or loss.

It returns a string value that can be _"profit","loss","no loss"_

Example

```
profits(100,1500)

returns: "profit"
```

```
profits(20,5)

returns: "loss"
```

```
profits(100,100)

returns: "no loss"
```
 */