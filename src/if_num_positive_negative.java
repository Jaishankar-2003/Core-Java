import java.util.Scanner;
public class if_num_positive_negative
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter num value");
        int num = scn.nextInt();
        if(num >= 0)
        {
            System.out.println("the num is positive");
        }
        else
        {
            System.out.println("the num is negative");
        }
    }
}
