
//sum of multiple of 4  11 to 20

public class practice_8
{
    public static void main (String[] args)
    {
        int i = 11;
        int sum = 0;
        while(i<=20)
        {
            if(i % 4 == 0 )
            {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
