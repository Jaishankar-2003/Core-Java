import java.util.Scanner;

public class while_all_num
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the first");
        int first = scn.nextInt();
        System.out.println("enter the first");
        int second = scn.nextInt();
            int i = first;
            while(i <= second)
            {
                System.out.println(i);
                i++;
            }

    }
}
