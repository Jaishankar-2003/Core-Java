class demo4
{
    public static void main()
    {
        System.out.println("hi");
    }
    public static void main(int x)
    {
        System.out.println("hello");
        System.out.println(x);
    }
    public static void main(double x , int y)
    {
        System.out.println("hey");
        System.out.println(x);
        System.out.println(y);
    }
}
public class overload_main
{
    public static void main (String[] args)
    {
        demo4.main();
        demo4.main(100);
        demo4.main(11.11,13);
    }
}
