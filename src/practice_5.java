
// print of count of digit

public class practice_5
{
    public static void main (String[] args)
    {
        int num = 234;
        int rem = 0;
        int count = 0;
        while(num > 0)
        {
            rem = num % 10;
            count ++;
            num = num / 10;
        }
        System.out.println(count);

    }
}
