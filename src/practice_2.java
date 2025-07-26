public class practice_2 {
    public static void main (String[] args)
    {
        int num = 26655;
        int rem = 0;
        int count = 0;
        while(num >0)
        {
            rem = num % 10;
            if(rem % 2 == 0)
            {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);

    }
}
