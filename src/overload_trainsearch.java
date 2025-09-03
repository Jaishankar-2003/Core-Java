import java.util.Scanner;
import java.util.StringJoiner;

class trainsearch
{
    public void search (int trainNo)
    {
        System.out.println("train search done successful via train number");
    }
    public void search (String train_name)
    {
        System.out.println("train search done successful via train name");
    }
}
public class overload_trainsearch
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        trainsearch train = new trainsearch();
        System.out.println("Enter the choice");
        System.out.println("1.traino\n2.train_name");
        int choice = scn.nextInt();
        switch(choice)
        {
            case 1 : System.out.println("Enter train number");
                     int trainNo = scn.nextByte();
                     train.search(trainNo);
                     break;

            case 2 : System.out.println("Enter train name");
                     String train_name = scn.next();
                     train.search(train_name);
                     break;
            default: System.out.println("invalid choice....");
        }
    }
}
