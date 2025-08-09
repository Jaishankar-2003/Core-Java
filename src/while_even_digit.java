import java.util.Scanner;

public class while_even_digit
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first");
        int first = scn.nextInt();

        int num = first;
        int rem  = 0;

        while(num > 0)
        {
            rem = num % 10;
            if(rem % 2 == 0)
            {
                System.out.println(rem);
            }
            num = num / 10;
        }
    }

}
