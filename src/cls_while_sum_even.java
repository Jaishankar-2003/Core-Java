
// display the  sum of all even num between 43 to 72

public class cls_while_sum_even
{
    public static void main (String[] args)
    {
        int i = 55;
        int sum =0;
        while(i<=99)
        {
            if(i%2==0)
            {
                sum = sum + i;

            }
            i++;
        }

        System.out.println(sum);
    }
}
