import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

/*
public class for_factorial
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

       // System.out.println("enter first");
       // int first = scn.nextInt();
        System.out.println("enter num");
        int num = scn.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= num ; i++)
        {
            if( num % i  == 0)
            {
                System.out.println(i);
            }
        }

    }
}
 */
public class for_factorial
{
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        // System.out.println("enter first");
        // int first = scn.nextInt();
        System.out.println("enter num");
        int num = scn.nextInt();
        int sum = 0;
        display(num);
    }
    public static void display(int num)
    {
        for(int i = 1 ; i <= num ; i++)
        {
            if( num % i  == 0)
            {
                System.out.println(i);
            }
        }

    }
}
