import java.util.Scanner;
/*

        it reverse the given number ( 259 ------> 952 )

            The logic of ( while reverse )

            rem = num % 10;
            rev = rev * 10 + rem;
            num = num /  10;

 */

public class while_reverse_num
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first ");
        int first = scn.nextInt();

        int num = first;
        int copy = num;
        int rem = 0;
        int rev = 0;
        while(num > 0 )
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num /  10;
        }
        System.out.println(copy);
        System.out.println(rev);

    }
}
