import java.util.Scanner;

public class string_palindrome
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value:");
        String s1 = scn.nextLine();
        String rev = "";

        // Build reversed string
        for (int i = s1.length() - 1; i >= 0; i--)
        {
            rev = rev + s1.charAt(i);
        }

        // Output
        System.out.println("Original: " + s1);
        System.out.println("Reversed: " + rev);

        // Palindrome check
        if (s1.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }

        scn.close();
    }
}
