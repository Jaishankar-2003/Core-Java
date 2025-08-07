import java.util.Scanner;

public class for_num
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter first value");
        int start = scn.nextInt();
        System.out.println("enter second value");
        int end = scn.nextInt();
        for(int i = start; i<=end ; i++)
        {
            System.out.println(i);
        }
    }
}
