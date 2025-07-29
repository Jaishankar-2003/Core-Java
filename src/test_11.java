import java.util.Scanner;

// check area of circle ( 3.14 * radius * radius )

public class test_11
{
    public static void main (String[] args)
    {
        Scanner scn=new Scanner(System.in);

        System.out.println("enter the side");

        int radius = scn.nextInt();

        double area = 3.14 * radius * radius;

        System.out.println("area of circle : " + area);

    }
}
