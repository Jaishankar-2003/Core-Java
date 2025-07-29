import java.util.Scanner;

// display the all num in reverse

public class test_2_2
{
    public static  void main (String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("enter 1 num");
        int first = scn.nextInt();
        System.out.println("enter 2 num");
        int second = scn.nextInt();
        int i = second;

        if(second > first)
        {
            while (i >= first)
            {
                System.out.println(i);
                i--;
            }
        }
        else
        {
            while(i <= first)
            {
                System.out.println(i);
                i++;
            }
        }

    }

}

