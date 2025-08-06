public class method3 {
    public static void main(String[] args)
    {
        float x = 10.12f;
        double y = 20.2;
        System.out.println("main");
        m1(x,y);
        System.out.println("end");

    }
    public static void m1 ( float x , double y )
    {
        System.out.println("m1");
        System.out.println(x);
        System.out.println(y);

    }
}
