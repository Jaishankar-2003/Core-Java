class bike
{
    String name;
    int price;
    String colour;
    int yom;
    String brand;
    public bike( String a , int b , String c , int d , String e)
    {
        name = a;
        price = b;
        colour = c;
        yom = d;
        brand = e;
    }
}
public class constructor_bike
{
    public static void main (String[] args)
    {
        bike m1 = new bike("vs50" , 9000 ,"red",2012 , "tvs");
        System.out.println(m1.name);
        System.out.println(m1.price);
        System.out.println(m1.colour);
        System.out.println(m1.yom);
        System.out.println(m1.brand);

        System.out.println("------------------");

        bike m2 = new bike("p220" , 90000 ,"red",2012 , "pulsar");
        System.out.println(m2.name);
        System.out.println(m2.price);
        System.out.println(m2.colour);
        System.out.println(m2.yom);
        System.out.println(m2.brand);

        System.out.println("------------------");

        bike m3 = new bike("r15" , 90000 ,"red",2012 , "yamaga");
        System.out.println(m3.name);
        System.out.println(m3.price);
        System.out.println(m3.colour);
        System.out.println(m3.yom);
        System.out.println(m3.brand);

        System.out.println("------------------");

        bike m4 = new bike("jupiter" , 80000 ,"red",2012 , "honda");
        System.out.println(m4.name);
        System.out.println(m4.price);
        System.out.println(m4.colour);
        System.out.println(m4.yom);
        System.out.println(m4.brand);

        System.out.println("------------------");

        bike m5 = new bike("duke" , 180000 ,"red",2012 , "ktm");
        System.out.println(m5.name);
        System.out.println(m5.price);
        System.out.println(m5.colour);
        System.out.println(m5.yom);
        System.out.println(m5.brand);

        System.out.println("------------------");

        bike m6 = new bike("ct100" , 10000 ,"red",2012 , "bajaj");
        System.out.println(m6.name);
        System.out.println(m6.price);
        System.out.println(m6.colour);
        System.out.println(m6.yom);
        System.out.println(m6.brand);
    }
}
