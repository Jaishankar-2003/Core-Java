import java.util.Scanner;

public class array_lowercase_char
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size");
        int size = scn.nextInt();

        // create an array
        double[] a1= new double[size];

        // insert values to array
        System.out.println("enter values");

        for(int i = 0 ; i<=size-1 ; i++)
        {
            a1[i] = scn.nextDouble();
        }

        // perform operation

        for(int i = 0 ; i <= size - 1; i++ )
        {
            if(a1[i] > 13.2)
            {
                System.out.println(a1[i]);
            }
        }
    }

}
