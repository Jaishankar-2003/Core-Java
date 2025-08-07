import java.util.Scanner;

public class array_sum_odd
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
        int sum = 0;
        for(int i = size-1 ; i>= 0; i-- )
        {
            if(i % 2 != 0)
            {
                sum = sum + a1[i];
            }
        }
        System.out.println(sum);
    }

}
