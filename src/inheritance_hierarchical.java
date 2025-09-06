 class inheritance_hierarchical
{
    public static void main(String[] args)
    {
        System.out.println("--------- a --------");
        a a1 = new a();
        a1.m1();
        System.out.println(a1.a);
        System.out.println("------b extend a-----------");
        b b1 = new b();
        b1.m1();
        b1.m2();
        System.out.println(b1.a);
        System.out.println(b1.b);
        System.out.println("--------c extend a ---------");
        c c1 = new c();
        c1.m1();
        c1.m3();
        System.out.println(c1.a);
        System.out.println(c1.c);
    }
}
class a
{
    int a = 10;
    public void m1()
    {
        System.out.println("Class A Method");
    }
}
class b extends a
{
    int b = 20;
    public void m2()
    {
        System.out.println("Class B Method");
    }
}
class c extends a
{
    int c = 30;
    public void m3()
    {
        System.out.println("Class C Method");
    }
}