class demo1
{
    public demo1()
    {
        System.out.println("hi");
    }
    public demo1(int x,double y)
    {
        System.out.println("hello");
        System.out.println(x);
        System.out.println(y);
    }
    public demo1(double x , int y)
    {
        System.out.println("hey");
        System.out.println(x);
        System.out.println(y);

    }
}
public class overload_constructor
{
    public static void main(String[] args)
    {
        demo1 d1 = new demo1();
        demo1 d2 = new demo1(10,19.10);
        demo1 d3 = new demo1(100.1,12);
    }
}
