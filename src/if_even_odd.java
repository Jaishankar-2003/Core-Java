import java.util.Scanner;

public class if_even_odd
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the i value");
        int i = scn.nextInt();
        if(i % 2 == 0)
        {
            System.out.println("the given num is even ");
        }
        else
        {
            System.out.println("the num is odd");
        }
    }
}
