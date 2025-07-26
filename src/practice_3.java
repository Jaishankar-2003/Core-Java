
// sum of odd and even digit

public class practice_3
{
    public static void main (String[] args)
    {
        int num = 245;
        int rem = 0;
        int esum = 0;
        int osum = 0;
        while(num > 0)
        {
            rem = num % 10;
            if(rem % 2 == 0)
            {
                esum = esum + rem;
            }
            else
            {
                osum = osum + rem;
            }
            num = num / 10;
        }
        System.out.println(esum);
        System.out.println(osum);
    }
}
