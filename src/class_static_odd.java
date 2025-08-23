import java.util.Scanner;

public class class_static_odd
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter start");
        int start = scn.nextInt();
        System.out.println("enter end");
        int end = scn.nextInt();
        odd.print(start,end);
    }
}
class odd
{
    public static void print(int start , int end)
    {
        System.out.println("----result----");
        for(int i = start; i <= end ; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}

