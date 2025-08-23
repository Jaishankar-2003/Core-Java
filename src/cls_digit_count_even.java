
//  count of even digits

public class cls_digit_count_even
{
    public static void main (String[] args)
    {
        int num = 11588;
        int rem = 0;
        int count =0;
        while(num > 0)
        {
            rem = num % 10;
            if(rem % 2==0)
            {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
