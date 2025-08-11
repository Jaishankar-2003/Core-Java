import java.util.Scanner;

public class array_dis_reverse
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size");
        int size = scn.nextInt();

        //create an array
        int[] a1 = new int[size];

        //insert values
        System.out.println("enter values");
        for(int i = 0 ; i <= size-1 ; i++)
        {
            a1[i]= scn.nextInt();
        }

        //perform operation
        for(int i = size-1 ; i >= 0 ; i--)
        {
            System.out.println("The reverse number : " + a1[i]);
        }
    }
}
