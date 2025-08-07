import java.util.Scanner;

public class for_sum
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("first value");
        int first = scn.nextInt();
        System.out.println("Second value");
        int last = scn.nextInt();
        int sum = 0;
        for(int i = first ; i <= last ; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
