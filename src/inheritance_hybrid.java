 class inheritance_hybrid
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
        System.out.println("--------c extend b ---------");
        c c1 = new c();
        c1.m1();
        c1.m2();
        c1.m3();
        System.out.println(c1.a);
        System.out.println(c1.b);
        System.out.println(c1.c);
        System.out.println("--------d extend a ---------");
        d d1 = new d();
        d1.m1();
        d1.m4();
        System.out.println(d1.a);
        System.out.println(d1.d);
        System.out.println("--------e extend a ---------");
        e e1 = new e();
        e1.m1();
        e1.m5();
        System.out.println(e1.a);
        System.out.println(e1.e);
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
class c extends b
{
    int c = 30;
    public void m3()
    {
        System.out.println("Class C Method");
    }
}
class d extends a
{
    int d = 40;
    public void m4()
    {
        System.out.println("Class D Method");
    }
}
class e extends a
{
    int e = 50;
    public void m5()
    {
        System.out.println("Class E Method");
    }
}