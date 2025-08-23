import java.util.Scanner;

public class class_static_even_reverse
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter start");
        int start = scn.nextInt();
        System.out.println("enter end");
        int end = scn.nextInt();
        even.m1(end,start);
    }
}
class even
{
    public static void m1 (int end , int start)
    {
        System.out.println("----result----");
        for(int i = end ; i>=start ; i--)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
