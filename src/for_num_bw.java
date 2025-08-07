import java.util.Scanner;

public class for_num_bw
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first");
        int first = scn.nextInt();
        System.out.println("Enter last");
        int last = scn.nextInt();

        for(int i = first ; i<= last ; i++)
        {
            System.out.println(i);
        }
    }
}
