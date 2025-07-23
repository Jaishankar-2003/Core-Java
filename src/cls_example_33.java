
// display the fibonacii series

public class cls_example_33 {
    public static void main (String[] args)
    {
        int length = 6;
        int n1 = 0;
        int n2 = 1;
        int n3 = n1+n2;

        for(int i = 1; i <= length; i++)
        {
            System.out.println(n1);
            n1 = n2;
            n2 = n3;
            n3 = n1+n2;
        }

    }
}
