public class logic_operat {
    public static void main (String[] args)
    {
        int x = 100 , y = 200 , z = 300 , a = 21 , b = 56;  //variable declare and initialize
        System.out.println(x==100 && x<y);
        System.out.println( x>y || z<=y);
        System.out.println(x>=z && y!=x);
        System.out.println(z>x && x<y);
        System.out.println(z!=-100 && x>0);
        System.out.println(z!=z && y==x);
        System.out.println(!(10>10));
        System.out.println(!(x==100)&&!(x<y));

        System.out.println(a&b);
        System.out.println(a|b);

    }
}
