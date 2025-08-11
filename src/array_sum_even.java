import java.util.Scanner;

public class array_sum_even
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter size");
        int size = scn.nextInt();

        // create the array

        int[] a1 = new int[size];

        // insert values
        System.out.println("Enter values");
        for(int i = 0 ; i <= size - 1 ; i++ )
        {
            a1[i] = scn.nextInt();
        }

        // perform operstion
        int sum = 0;
        for(int i = 0 ; i<= size - 1 ; i++)
        {
            if(a1[i] % 2 == 0)
            {
                sum = sum + a1[i];
            }
        }
        System.out.println("The sum value is :" + sum);
    }
}
