import java.util.Scanner;

// check area of rectangle ( length * breadth )

public class test_9
{
    public static void main (String[] args)
    {
        Scanner scn=new Scanner(System.in);

        System.out.println("enter the breadth");

        double breadth = scn.nextInt();

        System.out.println("enter the length");

        double length = scn.nextInt();

        double area = breadth * length;
        System.out.println("area rectangle : " + area);

    }
}
