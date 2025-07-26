
// reverse a number and  check the palindrome


public class practice_1 {

    public static void main (String[] args)
    {
        int num = 123;
        int copy = num;
        int rem = 0;
        int rev = 0;
        while(num > 0)
        {
          rev = num % 10;
          rem = rem * 10 + rev ;
          num = num / 10;
        }
        System.out.println(copy);
        System.out.println(rem);

        if(copy==rem)
        {
            System.out.println("palin");
        }
        else
        {
            System.out.println("no pal");
        }


    }
}
