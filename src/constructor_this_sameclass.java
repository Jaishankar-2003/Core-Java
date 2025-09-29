class studentt
{
    public studentt()
    {
        System.out.println("no-arg constructor");
    }
    public studentt(String name)
    {
        this();
        System.out.println("one-arg constructor");
        System.out.println(name);
    }
    public studentt(String name, int num)
    {
        this(name);
        System.out.println("two-arg constructor");
        System.out.println(name + num);
    }
}
class constructor_this_sameclass
{
    public static void main(String[] args)
    {
       studentt s1 = new studentt("alpha", 101);
    }
}
