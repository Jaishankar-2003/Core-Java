import java.util.Scanner;

// it reverse the range of the given number

public class while_num_reverse
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first ");
        int first = scn.nextInt();
        System.out.println("enter second");
        int second = scn.nextInt();

        int i = second;
        while(i >= first)
        {
            System.out.println(i);
            i--;
        }
    }
}
