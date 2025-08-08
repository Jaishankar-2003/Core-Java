import java.util.Scanner;

// if perfect program   ( num = sum ) ---------->  ( i <= num - 1 )

public class for_perfect_num
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the num value");
        int num = scn.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= num - 1 ; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        if(num == sum)
        {
            System.out.println("the num is perfect");
        }
        else
        {
            System.out.println("the num is not perfect");
        }
    }
}
