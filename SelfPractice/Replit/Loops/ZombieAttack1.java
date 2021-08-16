package Replit.Loops;


import java.util.Scanner;

public class ZombieAttack1 {
    public static void main(String[] args) {
        int inhabitants = new Scanner(System.in).nextInt();
        int day = 0;

        for (int i = inhabitants; i >= 0; i--) {
            if (inhabitants!=0){
                System.out.println("Day "+day+" ["+inhabitants+"]");
                day++;
                inhabitants /=2;
            }else {
                System.out.println("---- EXTINCT ----");
                break;
            }

        }

    }


}
/*
A variable **inhabitants** represents a city and its respective populations. City might have a population of 0 due to a
pandemic zombie disease that is wiping away the human lives. After each day, a city will lose half of its population.
Write a program to loop the city population and make it lose half of its population **until population is zero**.
Print the each day like below for each day:



Example - inhabitants are 6

```
Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----
```


Example- inhabitants are 0

```
---- EXTINCT ----
```


Example- inhabitants are 20


```
Day 0 [20]
Day 1 [10]
Day 2 [5]
Day 3 [2]
Day 4 [1]
---- EXTINCT ----
 */