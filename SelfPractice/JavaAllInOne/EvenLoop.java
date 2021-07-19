package JavaAllInOne;

public class EvenLoop
{
    public static void main(String[] args)
    {
        int[ ] values = {6, 2, 1, 7, 12, 5};
        // Rewrite this loop as a for each loop and run
        //use Enhanced For loop, no need to index each number.
        for (int value:values)
        {
            if (value % 2 == 0)
            {
                System.out.println(value + " is even!");
            }
        }
    }
}
/*
Print the even in the array
 */
