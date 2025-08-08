import java.util.Scanner;

public class for_fibonaci
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter length");
        int length = scn.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;

        System.out.println("The expected fibonacci number");

        for(int i = 1 ; i <= length ; i++)
        {

            System.out.println(n1);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }
}
