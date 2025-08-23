public class class_static_AccountholderApp
{

    public static void main(String[] args)
    {
        Account tom = new Account();
        Account ram = new Account();

        System.out.println(" ---Tom detail--- ");
        tom.name = "Tom";
        tom.age = 21;
        tom.accountbalance = 21000;
        tom.testeligible();
        System.out.println("Is Tom eligible:" + tom.eligibleForCredit);

        System.out.println(" ---Ram detail---- ");
        ram.name = "Ram";
        ram.age = 26;
        ram.accountbalance = 26000;
        ram.testeligible();
        System.out.println("Is Ram eligible: " + ram.eligibleForCredit);
    }
}
class Account
{
    String name;              // non - static variable
    int age;
    float accountbalance;
    boolean eligibleForCredit;

    public void testeligible()        // non - static method
    {
        if (age > 25 && accountbalance > 10000)
        {
            eligibleForCredit = true;
            System.out.println("eligible to get loan");

        }
        else
        {
            eligibleForCredit = false;
            System.out.println("loan lam thara mudiyathu da thambi ");
        }
    }
}