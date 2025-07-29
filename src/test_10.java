import java.util.Scanner;

// check area of square ( side * side )

public class test_10
{
    public static void main (String[] args)
    {
        Scanner scn=new Scanner(System.in);

        System.out.println("enter the side");

        int side = scn.nextInt();

        double area = side * side;

        System.out.println("area square : " + area);

    }
}
