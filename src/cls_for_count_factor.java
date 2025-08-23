
// display COUNT OF factor of a given num

public class cls_for_count_factor {
    public static void main (String[] args)
    {
        int num = 6;
        int count = 0;
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }
        System.out.print(count);

    }
}
