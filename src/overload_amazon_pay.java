import java.util.Scanner;

class amazon_pay
{
    public void paymant()
    {
        System.out.println("payment done via cash on delivery...");
    }
    public void paymant(String upi)
    {
        System.out.println("payment done via upi...");
    }
    public void paymant(long cardno , int cvv)
    {
        System.out.println("payment done via card...");
    }
    public void paymant(String username , String password)
    {
        System.out.println("payment done via internet Banking...");
    }
    public void paymant(int test)
    {
        System.out.println("test");
    }
}
public class overload_amazon_pay
{
   public static void main (String[] args)
   {
       Scanner scn = new Scanner(System.in);
       amazon_pay  pay = new amazon_pay();
       System.out.println("Enter the choice");
       System.out.println("1.cash on delivery\n2.upi\n3.card\n4.Internet banking");
       int choice = scn.nextInt();
       switch (choice)
       {
           case 1 : pay.paymant();
                    break;

           case 2 : System.out.println("Enter upi");
                    String upi = scn.next();
                    pay.paymant(upi);
                    break;

           case 3 : System.out.println("Enter card number");
                    long cardno = scn.nextLong();
                    System.out.println("Enter cvv number");
                    int cvv = scn.nextInt();
                    pay.paymant(cardno,cvv);
                    break;

           case 4 :  System.out.println("Enter user name");
                     String username = scn.next();
                     System.out.println("Enter password");
                     String password = scn.next();
                     pay.paymant(username,password);
                     break;

           default: System.out.println("invalid choice...");
       }
       //pay.paymant(234);
   }
}
