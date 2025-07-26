
//multiple of 12     1 to 80

public class practice_10
{
    public static void main (String[] args)
    {
        int i = 1;
        while (i<=80)
        {
            if(i % 12 == 0)
            {
                System.out.println(i);
            }
            i++;
        }

    }
}
