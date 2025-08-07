import java.util.Scanner;

public class for_odd
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("first value");
        int first = scn.nextInt();
        System.out.println("last value");
        int last = scn.nextInt();

        for(int i = first ; i <= last ; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}
