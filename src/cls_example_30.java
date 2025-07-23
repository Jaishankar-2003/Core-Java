
// display COUNT OF factor of a given num

public class cls_example_30 {
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
