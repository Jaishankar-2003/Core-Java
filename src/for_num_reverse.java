import java.util.Scanner;

public class for_num_reverse
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter first");
        int first = scn.nextInt();
        System.out.println("enter last");
        int last = scn.nextInt();
        for(int i = last ; i >= first ; i--)
        {
            System.out.println(i);
        }
    }
}
