class create
{
    int x  = 20;
    static char a = 'S';
    public create()
    {
        System.out.println("create");
    }
    public void m1()
    {
        System.out.println("hi m1");
    }
    public static void m2()
    {
        System.out.println("hi m2");
    }
}
public class constructor_create
{
    public static void main(String[] args)
    {
        create c1 = new create();
        System.out.println(c1.x);
        System.out.println(sample.a);
        c1.m1();
        create.m2();
    }
}
