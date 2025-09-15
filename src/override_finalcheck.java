class parent
{
    final public void travel()
    {
        System.out.println("auto");
    }
}
class child extends parent
{
    /*
        @Override
        public void travel() // error: cannot override final method
        {
            System.out.println("bike");
        }

     */
}
public class override_finalcheck
{
    public static void main(String[] args)
    {
        child c = new child();
        c.travel();
    }
}
