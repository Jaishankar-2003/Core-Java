public class cls_example8
{
    public static void main (String[] args)
    {
        double num = 1000;
        if(num > 200)
        {
            num = num + num * 0.60;
            //System.out.println("The student is eligible for exam");
        }
        else if (num < 200)
        {
            num = num + num * 0.40;
        }
        else
        {
            num = num - num * 0.50;
        }
        System.out.println("The final value is  " + num);
    }
}
