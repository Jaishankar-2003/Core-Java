

//   odd digits


public class cls_example_48 {

    public static void main (String[] args)
    {
        int num = 258;
        int rem = 0;
        while(num > 0)
        {
            rem = num % 10;

            if (rem % 2 !=0  )
            {
                System.out.println(rem);
            }
            num = num / 10;
        }
    }
}
