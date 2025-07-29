import java.util.Scanner;

// fibonacii series

public class test_7
{
    public static void main (String[] args)
    {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the num");

        int length = scn.nextInt();

        int len = length;
        int n1  = 0;
        int n2 = 1;
        int n3 = n1 + n2;

        for(int i = 1 ; i <= len ; i++)
        {
            System.out.println(n1);
            n1 = n2;
            n2 = n3;
            n3 = n1+n2;
        }
    }
}
