import java.util.Scanner;

// display the all num in reverse

public class test_2
{
    public static  void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first");
        int first = scn.nextInt();
        System.out.println("enter second");
        int end = scn.nextInt();

       if (first > end )
       {
           while (first >= end )
           {
               System.out.println(first);
               first--;
           }
       }
       else
       {
            while (end >= first)
            {
                System.out.println(end);
                end--;
            }
       }
    }
}
