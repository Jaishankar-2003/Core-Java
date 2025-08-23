
//  sum of even digits


public class cls_digit_sum_even {

    public static void main (String[] args)
    {
        int num = 258;
        int rem = 0;
        int sum =0;
        while(num > 0)
        {
            rem = num % 10;
            if(rem % 2==0)
            {
                sum = sum +rem;
            }
            num = num / 10;
        }
        System.out.println(sum);
    }
}
