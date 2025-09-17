package abstract_amazon;

public class mainmethod
{
    public static void main(String[] args)
    {
        System.out.println("version v1");
        System.out.println("-----------");
        amazonv1.login();
        amazonv1.shop();
        amazonv1.prime();
        amazonv1.logout();
        System.out.println("*****************");
        System.out.println("version v2");
        System.out.println("-----------");
        amazonv2.login();
        amazonv2.shop();
        amazonv2.prime();
        amazonv2 v2 = new amazonv2();
        v2.paybill();
        amazonv2.logout();
    }
}
