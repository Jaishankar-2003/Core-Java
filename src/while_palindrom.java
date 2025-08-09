import java.util.Scanner;

/*

        palindrome  ------------>   (copy == rev)

            The logic of palindrome

            rem = num % 10;
            rev = rev * 10 + rem;
            num = num /  10;

 */
public class while_palindrom
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the num ");
        int first = scn.nextInt();

        int num = first;
        int copy = num;
        int rev = 0;
        int rem = 0;

        while(num >0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num /  10;
        }
        System.out.println(rev);
        System.out.println(copy);
        if(copy == rev)
        {
            System.out.println("num is palindrome");
        }
        else
        {
            System.out.println("num is not a palindrome");
        }

    }
}
