class Instagramv1
{
    public void login()
    {
        System.out.println("login done");
    }
    public void reels()
    {
        System.out.println("30 sec reels upload");
    }
    public void sharepost()
    {
        System.out.println("share post via instagram");
    }
    public void message()
    {
        System.out.println("message sent/received");
    }
    public void like()
    {
        System.out.println("like done");
    }
    public void logout()
    {
        System.out.println("logout done");
    }
}
class Instagramv2 extends Instagramv1
{
    @Override
    public void reels()
    {
        System.out.println("90 sec reels upload");
    }

    @Override
    public void sharepost()
    {
        System.out.println("share post via instagram/whatsapp/gamil");
    }
}
public class override_instagram
{
    public static void main(String[] args)
    {
        System.out.println("Version 1 feature are :");
        System.out.println("-------------------------");
        Instagramv1 v1 = new Instagramv1();
        v1.login();
        v1.reels();
        v1.sharepost();
        v1.message();
        v1.like();
        v1.logout();
        System.out.println("---------------------------------");
        System.out.println("Version 2 feature are :");
        System.out.println("-------------------------");
        Instagramv2 v2 = new Instagramv2();
        v2.login();
        v2.reels();
        v2.sharepost();
        v2.message();
        v2.like();
        v2.logout();
    }
}
