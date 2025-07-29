import java.util.Scanner;

public class test_1
{
    public static  void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first");
        int first = scn.nextInt();
        System.out.println("enter second");
        int second = scn.nextInt();

        if(first > second)
        {
            System.out.println("first is greater then second");
        }
        else
        {   System.out.println("second is greater then first");
        }
    }
}
