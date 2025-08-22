import java.util.Scanner;

public class class_nonstatic_square
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length");
        Double side = scn.nextDouble();
        nonstaticc n2 = new nonstaticc();
        n2.display(side);
    }
}
class nonstaticc
{
    public void display(Double side)
    {
        double area = side * side;
        System.out.println("area of Square : " +  area);
    }
}
