package compile_time_polymorphism;
import java.util.Scanner;

class facebook
{
    public void login(long phn ,String pwd)
    {
        System.out.println("Login with phone number and password");
    }
    public void login(String name , String pwdd)
    {
        System.out.println("Login with username and password");
    }
}
public class facebook_login
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        facebook f1 = new facebook();
        System.out.println("1.phone\n2.email");
        System.out.println("Enter your choice");
        int choice = scn.nextInt();
        switch(choice)
        {
            case 1 : System.out.println("enter phone number");
                     long phn = scn.nextLong();
                     System.out.println("enter pwd");
                     String pwd = scn.next();
                     f1.login(phn,pwd);
                     break;

            case 2 : System.out.println("enter name");
                     String name = scn.next();
                    System.out.println("enter pwd");
                    String pwdd = scn.next();
                    f1.login(name,pwdd);
                    break;
            default: System.out.println("invalid choice");
        }
    }
}
