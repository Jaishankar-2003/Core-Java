package interface1;

interface A
{
    void m1();
}
interface B
{
    void m1();
}
interface C extends A , B
{
    void m2();
}
class D implements C
{

    @Override
    public void m1()
    {
        System.out.println("method m1 achieve multiple inheritance");
    }

    @Override
    public void m2()
    {
        System.out.println("method m2 achieve multiple inheritance");
    }
}
class multiple_inheritance
{
    public static void main(String[] args)
    {
        D d1 = new D();
        d1.m1();
        d1.m2();
    }
}