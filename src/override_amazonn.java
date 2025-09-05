class AmazonVersion1
{
    public void login()
    {
        System.out.println("login done");
    }
    public void pay()
    {
        System.out.println("you can pay phone bill");
    }
    public void shop()
    {
        System.out.println("you can do shopping");
    }
    public void logout()
    {
        System.out.println("logout done");
    }
}
class AmazonVersion2 extends AmazonVersion1
{
    @Override
    public void pay()
    {
        System.out.println("you can pay phone/gas/water bill");
    }
    public void music()
    {
        System.out.println("you can listen to music");
    }
    public void prime()
    {
        System.out.println("you can watch movies and series");
    }
}
public class override_amazonn
{
    public static void main(String[] args)
    {
        System.out.println("Version 1 feature are :");
        System.out.println("-------------------------");
        AmazonVersion1 v1 = new AmazonVersion1();
        v1.login();
        v1.pay();
        v1.shop();
        v1.logout();
        System.out.println("-------------------------------------");
        System.out.println("Version 2 feature are :");
        System.out.println("-------------------------");
        AmazonVersion2 v2 = new AmazonVersion2();
        v2.login();
        v2.pay();
        v2.shop();
        v2.music();
        v2.prime();
        v2.logout();
    }
}
