public class cls_percent_if
{
    public static void main (String[] args)
    {
        double salary = 10000;
        if(salary > 5000)
        {
            salary = salary + salary * 0.70;
            //System.out.println("The student is eligible for exam");
        }
        else
        {
            salary = salary + salary * 0.35;
        }
        System.out.println("The salary of the user is " + salary);
    }
}
