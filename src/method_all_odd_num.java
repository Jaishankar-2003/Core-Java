import java.util.Scanner;
public class method_all_odd_num
{
    public static void main (String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter first");
        int first =scn.nextInt();
        System.out.println("enter end");
        int end =scn.nextInt();
        check(first , end);
    }
    public static void check ( int first , int end)
    {

        for (int i = first ; i <= end ; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}
