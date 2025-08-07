import java.util.Scanner;

public class for_sumof_factor
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter num ");
        int num = scn.nextInt();
        int sum = 0;
        for(int i = 1 ; i < num ; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
