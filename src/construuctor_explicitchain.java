class devices
{
    public devices(String brand)
    {
        System.out.println(brand);
        System.out.println("Super class constructor");
    }
    public void turnON()
    {
        System.out.println("Turn on Dev");
    }
    public void turnoff()
    {
        System.out.println("Turn off Dev");
    }
}
class project extends devices
{
    public project(String colour)
    {
        super("epsilon");
        System.out.println(colour);
        System.out.println("Sub class constructor");
    }
}
public class construuctor_explicitchain
{
    public static void main(String[] args)
    {
        project p = new project("black");
        p.turnoff();
        p.turnON();
    }
}
