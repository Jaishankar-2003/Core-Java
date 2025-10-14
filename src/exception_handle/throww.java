package exception_handle;

public class throww
{
    static void checkage(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("age not sufficient");
        }
    }

    public static void main(String[] args)
    {
        checkage(15);

    }
}
