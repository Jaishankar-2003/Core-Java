package typecast;
class remotecontrol
{
    void turnon()
    {
        System.out.println("turnon");
    }
    void turnoff()
    {
        System.out.println("turnoff");
    }
}
class project extends remotecontrol
{
    void display()
    {
        System.out.println("display");
    }
    @Override
    void turnon()
    {
        System.out.println("overrided turnon");
    }
    @Override
    void turnoff()
    {
        System.out.println("overrided turnoff");
    }
}
class mainmethod
{
    public static void main(String[] args)
    {
        remotecontrol r1 = (remotecontrol) new project();
        project p1 = (project) new remotecontrol();
        p1.turnoff();
        p1.turnon();
    }
}