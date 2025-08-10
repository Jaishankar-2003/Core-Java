public class method_passval_returnnoting_1
{
    public static void main(String[] args)
    {
        System.out.println("main method start");
        m1(12,true);
        System.out.println("main method end");

    }
    public static void m1(int x , boolean y)
    {
        System.out.println("void m1 method");
        System.out.println(x);
        System.out.println(y);
    }
}
