package Datahidinig;

public class A
{
    private int x = 10;
    public int getX()
    {
        return this.x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
}
class mainmethod
{
    public static void main(String[] args)
    {
        A a1 = new A();
        System.out.println(a1.getX());
        a1.setX(100);
        System.out.println(a1.getX());

        A a2 = new A();
        System.out.println(a2.getX());
        a2.setX(200);
        System.out.println(a2.getX());
    }
}
