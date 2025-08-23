
// display the  all even num between 521 to 751 in reverse order

public class cls_while_rev_range
{
    public static void main (String[] args)
    {
        int i = 751;
        while(i>=521)
        {
            if(i%2==0)
            {
                System.out.println(i);

            }
            i--;
        }

    }
}
