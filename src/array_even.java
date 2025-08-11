import java.util.Scanner;

public class array_even
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
        for(int i = 0 ; i<= size - 1 ; i++)
        {
            if(a1[i] % 2 == 0)
            {
                System.out.println("The even number is : " + a1[i]);
            }
        }
    }
}
