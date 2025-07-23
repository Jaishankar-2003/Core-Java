
// display the perfect number or not a perfect number

public class cls_example_32 {
    public static void main (String[] args)
    {
        int num = 6;
        int sum = 0;
        for(int i = 1; i <= num-1; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println("num =" + num);
        System.out.println("sum =" + sum);
        if(num == sum)
        {
            System.out.println("The give num is perfect");
        }
        else
        {
            System.out.println("The give  num is not perfect");
        }

    }
}
