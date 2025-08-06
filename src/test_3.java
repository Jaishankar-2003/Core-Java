import java.util.Scanner;

// display the even num

public class test_3
{
    public static  void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first");
        int first = scn.nextInt();
        System.out.println("enter second");
        int end = scn.nextInt();

        if (first <= end)
        {
            while (first <= end )
            {
                if(first % 2 == 0 )
                {
                    System.out.println(first);
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
                    System.out.println(first);
                }
                first--;
            }
        }
    }
}
