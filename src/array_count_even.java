import java.util.Scanner;

public class array_count_even
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size");
        int size = scn.nextInt();

        // create an array
        int[] a1= new int[size];

        // insert values to array
        System.out.println("enter values");

        for(int i = 0 ; i<=size-1 ; i++)
        {
            a1[i] = scn.nextInt();
        }

        // perform operation
        int count = 0;
        for(int i = 0 ; i <= size-1; i++ )
        {
            if(i % 2 == 0)
            {
               count++;
            }
        }
        System.out.println(count);
    }

}
