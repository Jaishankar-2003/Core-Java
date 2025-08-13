import java.util.Scanner;

//  if prime program  ==    ( count ==  2 ) ------- >    in factorial method

/*
public class for_prime
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter num ");
        int num = scn.nextInt();
        int count = 0;
        for(int i = 1 ; i <= num ; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }
        System.out.println(count);
        if(count == 2)
        {
            System.out.println("The given num is prime");
        }
        else
        {
            System.out.println("The given num is not prime");
        }

    }
}
*/
public class for_prime
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter num ");
        int num = scn.nextInt();
        int count = 0;
        display(num,count);
    }
    public static void display(int num , int count)
    {
        for(int i = 1 ; i <= num ; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }
        System.out.println(count);
        if(count == 2)
        {
            System.out.println("The given num is prime");
        }
        else
        {
            System.out.println("The given num is not prime");
        }
    }
}
