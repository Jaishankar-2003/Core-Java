class phonepev1
{
    public void login()
    {
        System.out.println("login");
    }
    public void sendmoney()
    {
        System.out.println("send money");
    }
    public void checkbalance()
    {
        System.out.println("check balance");
    }
    public void recharge()
    {
        System.out.println("recharge");
    }
    public void logout()
    {
        System.out.println("logout");
    }
}
class phonepev2 extends phonepev1
{
    public void paybill()
    {
        System.out.println("pay bill");
    }
    public void bookticket()
    {
        System.out.println("book ticket");
    }
}
class phonepev3 extends phonepev2
{
    public void loan()
    {
        System.out.println("loan");
    }
}
public class inheritance_phonepay
{
    public static void main (String[] args)
    {
        phonepev1 v1 = new phonepev1();
        v1.login();
        v1.sendmoney();
        v1.checkbalance();
        v1.recharge();
        v1.logout();
        System.out.println("--------------");

        phonepev2 v2 = new phonepev2();
        v2.login();
        v2.sendmoney();
        v2.checkbalance();
        v2.recharge();
        v2.paybill();
        v2.bookticket();
        v2.logout();

        System.out.println("--------------");

        phonepev3 v3 = new phonepev3();

        v3.login();
        v3.sendmoney();
        v3.checkbalance();
        v3.recharge();
        v3.paybill();
        v3.bookticket();
        v3.loan();
        v3.logout();
    }
}
