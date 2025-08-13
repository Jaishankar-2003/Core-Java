import java.util.Scanner;

public class string_uppercase
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        System.out.println("Enter the given string");
        char ch = ' ';
        display(s1,ch);

    }
    public static void display(String s1 , char ch)
    {
        for(int i = 0; i<= s1.length()-1 ; i++)
        {
            ch = s1.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                System.out.println(ch);
            }
        }
    }
}
