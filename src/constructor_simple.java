class simple
{
    public simple()
    {
        System.out.println("hello");
    }
}
public class constructor_simple
{
    public static void main (String[] args)
    {
        System.out.println("main");
        simple s1 = new simple();
        simple s2 = new simple();
        System.out.println("end");
    }

}
