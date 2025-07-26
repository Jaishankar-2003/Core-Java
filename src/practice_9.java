
//sum of all odd num between 1 to 5

public class practice_9
{
    public static void main (String[] args)
    {
        int i = 1;
        int sum = 0;
        while(i <= 5)
        {
            if(i % 2 != 0)
            {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
