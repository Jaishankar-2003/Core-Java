public class cls_else_if
{
    public static void main (String[] args)
    {
        int num = 10;
        if(num > 500)
        {
           num = num + 50;
        }
        else if (num < 500)
        {
            num = num - 50;
        }
        else
        {
            num = num + 100;
        }
        System.out.println("the final value is" + num);
    }
}
