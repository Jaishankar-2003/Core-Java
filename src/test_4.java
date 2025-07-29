import java.util.Scanner;

// display sum of all even

public class test_4
{
    public static  void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first");
        int first = scn.nextInt();
        System.out.println("enter second");
        int end = scn.nextInt();
        int sum = 0;

        if (first <= end)
        {
            while (first <= end )
            {
                if(first % 2 == 0 )
                {
                    sum = sum + first;
                }
                first++;
            }
        }
        else
        {
            while (first >= end )
            {
                if(first % 2 == 0 )
                {
                    sum = sum + first;
                }
                first--;
            }
        }
        System.out.println("sum of all : " +  sum);
    }
}
