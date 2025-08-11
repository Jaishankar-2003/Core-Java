import java.util.Scanner;

public class array_uppercase
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter size");
        int size = scn.nextInt();

        // create an array
        char[] a1 = new char[size];

        //insert values
        System.out.println("enter values");
        for(int i = 0 ; i<=size-1 ; i++)
        {
            a1[i]= scn.next().charAt(0);
        }

        //perform operation
        for(int i = 0 ; i <= size - 1 ; i++)
        {
            if(a1[i] >= 'A' && a1[i] <= 'Z')
            {
                System.out.println(a1[i]);
            }
        }

    }
}
