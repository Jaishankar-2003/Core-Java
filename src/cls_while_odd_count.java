
// display the  count of all odd num between 549 to 899

public class cls_while_odd_count
{
    public static void main (String[] args)
    {
        int i = 549;
        int count = 0;
        while(i<=899)
        {
            if(i%2!=0)
            {
                count++;

            }
            i++;
        }

        System.out.println(count);
    }
}
