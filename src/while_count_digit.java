import java.util.Scanner;

/*
            logic of count digit

            rem = num % 10;
            count++;
            num = num / 10;
 */

public class while_count_digit
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first ");
        int first = scn.nextInt();

        int num = first;
        int count = 0;
        int rem = 0;

        while(num > 0)
        {
            rem = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println(count);

    }
}
