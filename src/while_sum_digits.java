import java.util.Scanner;

/*
            logic of sum digit

            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
 */

public class while_sum_digits
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter num");
        int first  = scn.nextInt();
        // System.out.println("enter second");
        // int second = scn.nextInt;

        int num = first;
        int sum = 0;
        int rem = 0;

        while(num > 0)
        {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
