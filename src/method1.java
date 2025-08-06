public class method1 {
    public static void main(String[] args)
    {
        double x = 10;
        long y = 20;
        System.out.println("main");
        m1(x,y);

    }
    public static void m1 (double x , long y )
    {
        System.out.println("m1");
        System.out.println(x);
        System.out.println(y);

    }
}
