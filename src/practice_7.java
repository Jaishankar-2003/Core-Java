
//count of even number  ( while )  21 to 30

public class practice_7
{
    public static void main (String[] args)
    {
        int i = 21;
        int count = 0;
        while (i <= 30)
        {
            if(i % 2 == 0)
            {
                count++;
            }
        }
        System.out.println(count);
    }

}
