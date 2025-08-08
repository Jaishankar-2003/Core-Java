import java.awt.desktop.SystemEventListener;
import java.util.Scanner;


public class for_factorial
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

       // System.out.println("enter first");
       // int first = scn.nextInt();
        System.out.println("enter second");
        int second = scn.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= second ; i++)
        {
            if( second % i  == 0)
            {
                System.out.println(i);
            }
        }

    }
}
