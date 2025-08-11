import java.util.Scanner;

public class array_dis_position
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        // 1 & 2 create the array and assign the value

        int [] a1 = {11,22,33,44,55};
        System.out.println("enter key");
        int key = scn.nextInt();

        for(int i = 0 ; i <= a1.length-1 ; i++)
        {
            if(a1[i] == key)
            {
                System.out.println(i);
            }
        }

    }
}
