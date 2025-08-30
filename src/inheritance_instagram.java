class instagramv1
{
    public void login()
    {
        System.out.println("login");
    }
    public void message()
    {
        System.out.println("message");
    }
    public void like()
    {
        System.out.println("like");
    }
    public void reels()
    {
        System.out.println("reel");
    }
    public void logout()
    {
        System.out.println("logout");
    }
}
class instagramv2 extends instagramv1
{
    public void sharepost()
    {
        System.out.println("share post");
    }
    public void uploadpost()
    {
        System.out.println("uploadpost");
    }
}
public class inheritance_instagram
{
    public static void main (String[] args)
    {
        instagramv1  v1 = new instagramv1();
        v1.login();
        v1.message();
        v1.like();
        v1.reels();
        v1.logout();

        System.out.println("----------------------");

        instagramv2  v2 = new instagramv2();
        v2.login();
        v2.message();
        v2.like();
        v2.reels();
        v2.sharepost();
        v2.uploadpost();
        v2.logout();
    }
}
