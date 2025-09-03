class demo2
{
    public static void m1()
    {
        System.out.println("hi");
    }
    public static void m1(int x)
    {
        System.out.println("hello");
        System.out.println(x);
    }
    public static void m1(double x , int y)
    {
        System.out.println("hey");
        System.out.println(x);
        System.out.println(y);
    }
}
public class overload_static_mthod
{
    public static void main (String[] args)
    {
        demo2.m1();
        demo2.m1(100);
        demo2.m1(11.11,13);
    }
}
