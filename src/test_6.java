import java.util.Scanner;

// display the all num in reverse

public class test_6
{
    public static  void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first");
        int number = scn.nextInt();
        System.out.println("enter second");
        int sum = 0;
        int i = 1;

        while (i < number)
        {
           if (number % i == 0 )
           {
               sum = sum + i;
           }
           i++;
        }
        if(sum == number)
        {
            System.out.println("the num is perfect");
        }
        else
        {
            System.out.println("the num is perfect");
        }
    }
}
