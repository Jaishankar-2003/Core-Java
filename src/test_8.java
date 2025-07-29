import java.util.Scanner;

// check palindrome or not

public class test_8
{
    public static void main (String[] args)
    {
        Scanner scn=new Scanner(System.in);

        System.out.println("enter the num ");

        int num = scn.nextInt();
       // int num = 2256;
        int copy = num;
        int rem = 0;
        int rev = 0;

        while(num >0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(rev == copy)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }



    }
}
