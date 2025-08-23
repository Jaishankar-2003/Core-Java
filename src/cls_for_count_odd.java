public class cls_for_count_odd
{
    public static void main (String[] args)
    {
        int count = 0;
        for(int i = 555; i <= 999; i++)
        {
            if(i % 2 != 0)
            {
                count++;
            }

        }
        System.out.println(count);
    }
}
