class cchain
{
    public cchain()
    {
        System.out.println("no_arg");
    }
    public cchain(String name)
    {
        System.out.println("one arg");
        System.out.println(name);
    }
    public cchain(String name , int roll)
    {
        this(name);
        System.out.println("two arg ");
        System.out.println(name);
        System.out.println(name + roll);

    }
    public static void main(String[] args)
    {
        cchain d2 = new cchain("test" , 420);
    }
}
/*public class constructor_chain_overload
{

}

 */
