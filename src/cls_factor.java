
// display factor of a given num

public class cls_factor
{
    public static void main (String[] args)
    {
        int num = 6;
        for(int i = 1; i <= num; i++)
        {
            if(num % i ==0)
            {
                System.out.println(i);
            }
        }

    }
}
