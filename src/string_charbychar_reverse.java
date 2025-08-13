import java.util.Scanner;

public class string_charbychar_reverse
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String value");
        String s1 = scn.nextLine();
        char ch = ' ';
        display(s1,ch);
    }
    public static void display(String s1 , char ch)
    {
        for(int i = s1.length()-1 ; i >= 0 ; i--)
        {
            ch = s1.charAt(i);
            System.out.println(ch);
        }
    }
}
