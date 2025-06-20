public class AccountholderApp {

    public static void main(String[] args) {
        Account tom = new Account();
        Account ram = new Account();

        tom.name = "Tom";
        tom.age = 21;
        tom.accountbalance = 21000;
        System.out.println("Is Tom eligible: " );
        tom.testeligible();
        ram.name = "Ram";
        ram.age = 26;
        ram.accountbalance = 26000;
        ram.testeligible();

        System.out.println("Is Ram eligible: " + ram.eligibleForCredit);
    }
}

class Account {
    String name;
    int age;
    float accountbalance;
    boolean eligibleForCredit;

    public void testeligible() {
        if (age > 25 && accountbalance > 10000) {
            eligibleForCredit = true;
        } else {
            System.out.println("loan lam thara mudiyathu da thambi ");
        } } }