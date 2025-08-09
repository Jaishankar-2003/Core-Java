import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class while_sum_multiple
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter first");
        int first = scn.nextInt();
        System.out.println("enter second");
        int second = scn.nextInt();

        int i = first;
        int sum = 0;
        while(i <= second)
        {
            if(i % 4 == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
