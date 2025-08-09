import java.util.Scanner;

public class while_count_even
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first");
        int first = scn.nextInt();
        System.out.println("enter second");
        int second = scn.nextInt();

        int i = first ;
        int count = 0;

        while (i <= second)
        {
            if(i % 2 == 0)
            {
                count++;
            }
            i++;
        }
        System.out.println(count);

    }
}
