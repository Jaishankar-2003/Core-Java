import java.util.Scanner;

public class array_value_reverse
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter size");
        int size = scn.nextInt();

        // create an array
        int[] a1 = new int[size];

        // insert value in array
        System.out.println("enter values");

        for( int i = 0; i <= size-1 ; i++)
        {
            a1[i] = scn.nextByte();
        }

        // perform operation

        for(int i = size-1 ; i >=0 ; i--)
        {
            System.out.println(a1[i]);
        }
    }
}
