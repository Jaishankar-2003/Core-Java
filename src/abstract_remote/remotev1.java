package abstract_remote;

abstract public class remotev1
{
    public static void power()
    {
        System.out.println("power on");
    }
    public static void channel()
    {
        System.out.println("next/previous");
    }
    abstract public void red();
    abstract public void green();
    abstract public void yellow();
}
class remotev2 extends remotev1
{
    @Override
    public void red()
    {
        System.out.println("red button");

    }
    @Override
    public void green()
    {
        System.out.println("green button");
    }

    @Override
    public void yellow()
    {
        System.out.println("yellow button");
    }
}
class mainmethod
{
    public static void main(String[] args)
    {
        System.out.println("----------remote_v1----------");
        remotev1.power();
        remotev2.channel();
        System.out.println("----------remote_v2----------");
        remotev2 v2 = new remotev2();
        v2.green();
        v2.red();
        v2.yellow();
    }
}