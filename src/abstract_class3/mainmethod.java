package abstract_class3;

abstract class demo1
{
    abstract public void m1();
}
class demo2 extends demo1
{
    public void m1()
    {
        System.out.println("m1 method implemented in demo2 class");
    }
}
class demo3 extends demo1
{
    public void m1()
    {
        System.out.println("m1 method implemented in demo3 class");
    }
}
public class mainmethod
{
    public static void main(String[] args)
    {
        demo2 d2 = new demo2();
        d2.m1();
        demo3 d3 = new demo3();
        d3.m1();
    }
}