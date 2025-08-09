import java.util.Scanner;

public class while_all_even
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first");
        int first = scn.nextInt();
        System.out.println("enter scecond");
        int second = scn.nextInt();

        int i = first;
        while(i <= second)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
            i++;

        }
    }
}
