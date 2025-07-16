public class cls_example5
{
    public static void main (String[] args)
    {
        int marks = 50;
        if(marks >= 50)
        {
            marks = marks + 3;
            //System.out.println("The student is eligible for exam");
        }
        else
        {
            marks = marks + 2;
        }
        System.out.println("The student mark is " + marks);
    }
}
