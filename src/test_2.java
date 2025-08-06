import java.util.Scanner;

// display the all num in reverse

public class test_2
{
    public static  void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter first: ");
        int first = scn.nextInt();

        System.out.print("Enter end: ");
        int end = scn.nextInt();

        // Always print from end to first
        int i = end;

        if (end > first)
        {
            while (i >= first)
            {
                System.out.println(i);
                i--;
            }
        } else
        {
            while (i <= first)
            {
                System.out.println(i);
                i++;
            }
        }
    }

}

