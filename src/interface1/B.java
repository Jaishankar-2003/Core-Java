package interface1;

interface a
{
    void m1();
}
interface b
{
    void m1();
}
class c implements a , b
{
    @Override
    public void m1()
    {
        System.out.println("method m1 achieve multiple inheritance");
    }
}
class multiple_inheritancee
{
    public static void main(String[] args)
    {
        c c1 = new c();
        c1.m1();
    }
}
