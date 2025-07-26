
// count of odd and even digit

public class practice_2
{
    public static void main (String[] args)
    {
        int num = 26655;
        int rem = 0;
        int ecount = 0;
        int ocount = 0;
        while(num >0)
        {
            rem = num % 10;
            if(rem % 2 == 0)
            {
                ecount++;
            }
            else
            {
                ocount++;
            }
            num = num / 10;
        }
        System.out.println(ecount);
        System.out.println(ocount);

    }


}
