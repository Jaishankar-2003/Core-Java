import java.util.Scanner;

public class for_count_factor
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("num enter");
        int num = scn.nextInt();
        int count = 0;
        for(int i = 1 ; i <= num ; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }
        System.out.println("the given count num : " + count);


    }
}
