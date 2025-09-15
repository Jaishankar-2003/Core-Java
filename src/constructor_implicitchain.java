
// ACCESS ONE CONSTRUCTOR FROM ANOTHER CONSTRUCTOR IN DIFFERENT CLASS
// BUT IN INPLICIT SUPER CLASS DON'T HAVE ANY ARGUMENT SO IN SUBCLASS CONSTRUCTOR SUPER() AUTOMATICALLY CALLS


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
        //super(); // HERE JAVA CALL SUPER CLASS CONSTRUCTOR AUTOMATICALLY IN INPLICIT [ BECAUSE SUPER CLASS DON'T HAVE ANY ARGUMENT ]
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
