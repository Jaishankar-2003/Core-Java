package compile_time_polymorphism;
import java.util.Scanner;

class phoneUnlockFeature
{
    public void unlock()
    {
        System.out.println("phone unlocked successfully by swiping");
    }
    public void unlock(int pin)
    {
        System.out.println("phone unlocked successfully by pin");
    }
    public void unlock(String password)
    {
        System.out.println("phone unlocked successfully by password");
    }
}
class MainMethod
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        phoneUnlockFeature p1 = new phoneUnlockFeature();
        System.out.println("Enter the choice");
        int choice = scn.nextInt();
        switch (choice)
        {
            case 1 : p1.unlock();
            break;

            case 2 :  System.out.println("Enter pin");
                        int pin  = scn.nextInt();
                        p1.unlock(pin);
                        break;

            case 3 :  System.out.println("Enter password");
                        String password = scn.next();
                        p1.unlock(password);
                        break;

        }
    }
}