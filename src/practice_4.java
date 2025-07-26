
// print odd and even digit

public class practice_4
{
    public static void main (String[] args)
    {
        int num = 258;
        int rem = 0;
        while (num > 0 )
        {
            rem = num % 10;
            if(num % 2 == 0)
            {
                System.out.println( "even " + rem);
            }
            else
            {
                System.out.println(" odd " + rem);
            }
            num = num / 10;
        }
    }
}
