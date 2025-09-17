package abstract_amazon;

abstract public class amazonv1
{
    public static void login()
    {
        System.out.println("login");
    }
    public static void shop()
    {
        System.out.println("shop");
    }
    public static void prime()
    {
        System.out.println("prime");
    }

    abstract public void paybill();

    public static void logout()
    {
        System.out.println("logout");
    }
}
