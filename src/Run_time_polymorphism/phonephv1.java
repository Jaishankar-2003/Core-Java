package Run_time_polymorphism;
import java.util.Scanner;

class phonephv1
{
    public void paybills()
    {
        System.out.println("you can pay only current bil");
    }
}
class phonephv2 extends phonephv1
{
    @Override
    public void paybills()
    {
        System.out.println("you can pay  current bill / gas bill / water bill");
    }
}
class MainMethod
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        phonephv1 v1 = new phonephv1();
        phonephv2 v2 = new phonephv2();
        System.out.println("enter choice");
        int choice = scn.nextInt();
        switch (choice)
        {
            case 1 :  if (choice == 1)
            {
                v1.paybills();
            }
            else
            {
                System.out.println("invalid choice");
            }
            break;
            case 2 : if (choice == 2)
            {
                v2.paybills();
            }
            else
            {
                System.out.println("invalid choice");
            }
            break;

        }

    }
}