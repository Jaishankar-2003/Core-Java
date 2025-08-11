import java.util.Scanner;

public class array_min
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter size");
        int size = scn.nextInt();

        // create an array
        int[] a1 = new int[size];

        System.out.println("enter values");
        // insert values into array
        for(int i = 0 ; i <= a1.length-1 ; i++)
        {
            a1[i]= scn.nextInt();
        }

        // perform the operation
        int min = a1[0];
        for(int i = 0 ; i <= a1.length-1 ; i++)
        {
            if(a1[i] < min)
            {
                min = a1[i];
            }
        }
        System.out.println(min);


    }
}
