public class cls_if_if_percent
{
    public static void main (String[] args)
    {
        int yoe  = 6;
        if (yoe > 5)
        {
            double salary = 10000;
            if(salary > 5000)
            {
                salary = salary + salary * 0.20;
            }
            else
            {
                salary = salary + salary * 0.10;
            }
            System.out.println("the total yoe of employe" + salary);
        }
        else
        {
            System.out.println("not eligible for increment");
        }
    }
}
