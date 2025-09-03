class demo3
{
    public void m1()
    {
        System.out.println("hi");
    }
    public void m1(int x)
    {
        System.out.println("hello");
        System.out.println(x);
    }
    public void m1(double x , int y)
    {
        System.out.println("hey");
        System.out.println(x);
        System.out.println(y);
    }
}
public class overload_nonstati_method
{
    public static void main (String[] args)
    {
        demo3 d1 = new demo3();
        d1.m1();
        d1.m1(100);
        d1.m1(11.12,17);
    }
}
