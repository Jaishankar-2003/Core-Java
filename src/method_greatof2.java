import java.util.Scanner;

public class method_greatof2
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("first ent");
        int first=scn.nextInt();
        System.out.println("second ent");
        int second = scn.nextInt();
        test(first , second);
    }
    public static void test (int first , int second)
    {
        if(first > second)
        {
            System.out.print("first > second");
        }
        else
        {
            System.out.println("second > first");
        }
    }
}
