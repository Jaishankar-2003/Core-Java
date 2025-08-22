import java.util.Scanner;

public class class_nonstatic_circle
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter radius");
        Double radius = scn.nextDouble();
        radius n3 = new radius();
        n3.display(radius);
    }
}
class radius
{
    public void display(Double radius)
    {
        Double area = 3.14*radius*radius;
        System.out.println("area of circle : " + area);
    }
}