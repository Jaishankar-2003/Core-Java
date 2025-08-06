import java.util.Scanner;

// display the even num in reverse

public class test_even_reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first");
        int first = scn.nextInt();
        System.out.println("enter second");
        int end = scn.nextInt();

        // Swap if needed to always go from bigger to smaller
        if (first <= end)
        {
            int temp = first;
            first = end;
            end = temp;
        }

        while (first >= end)
        {
            if (first % 2 == 0)
            {
                System.out.println(first);
            }
            first--;
        }

        scn.close();
    }
}
