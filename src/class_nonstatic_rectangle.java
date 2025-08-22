import java.util.Scanner;

public class class_nonstatic_rectangle
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length");
        Double length = scn.nextDouble();
        System.out.println("Enter breadth");
        Double breath = scn.nextDouble();
        rectangle n1 = new rectangle();
        n1.display(length,breath);
    }
}
class rectangle
{
    public void display(Double length , Double breath)
    {
        double area = length*breath;
        System.out.println("area of rectangle : " +  area);
    }
}
