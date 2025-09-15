class database
{
    public database()
    {
        System.out.println("superclass constructor");
    }
    public void open()
    {
        System.out.println("open db");
    }
    public void close()
    {
        System.out.println("close db");
    }
}
class mysql extends database
{
    public mysql()
    {
        System.out.println("sub-class constructor");
    }
}
public class constructor_implicitchain
{
    public static void main(String[] args)
    {
        mysql m1 = new mysql();
        m1.open();
        m1.close();
    }
}
