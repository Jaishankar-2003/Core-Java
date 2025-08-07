import java.util.Scanner;

public class if_age_vote
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        System.out.println("enter age");
        if(age > 18)
        {
            System.out.println("the gay is eligible for vote ");
        }
        else
        {
            System.out.println("the man is not eligible for vote");
        }
    }
}
