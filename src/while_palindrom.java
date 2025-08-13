import java.util.Scanner; // ✅ Required for Scanner

public class while_palindrom {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int first = scn.nextInt();

        int num = first;
        int copy = num;
        int rev = 0;
        int rem = 0;

        display(num, rem, rev, copy);
        scn.close(); // ✅ Close Scanner
    }

    public static void display(int num, int rem, int rev, int copy) {
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse: " + rev);
        System.out.println("Original: " + copy);

        if (copy == rev) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }
}
