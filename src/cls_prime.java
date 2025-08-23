
// display the prime number or not a prime

public class cls_prime
{
    public static void main (String[] args)
    {
        int num = 19;
        int count = 0;
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }
        System.out.println("num =" + num);
        System.out.println("count =" + count);
        if(count == 2)
        {
            System.out.println("The give  num is prime");
        }
        else
        {
            System.out.println("The give  num is not prime");
        }

    }
}
