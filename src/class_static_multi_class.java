public class class_static_multi_class
{
    public static void main(String[] args)
    {
        System.out.println("hi main");
        System.out.println(Demo.a);
        System.out.println(sample.a);
        Demo.print();
        sample.display();
        System.out.println("bye main");
    }
}
class Demo
{
    static int a = 100;
    public static void print()
    {
        System.out.println("hi Demo");
    }
}
class sample
{
    static double a = 10.10;
    public static void display()
    {
        int b = 100;
        System.out.println("hi sample");
        System.out.println(b);
    }
}
