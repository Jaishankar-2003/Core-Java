import java.util.Scanner;

public class while_multiple_12
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first");
        int first = scn.nextInt();
        System.out.println("enter second");
        int second = scn.nextInt();

        int i = first;
        while(i <= second)
        {
            if(i % 12 == 0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
