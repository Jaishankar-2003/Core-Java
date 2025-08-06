public class method2 {
    public static void main(String[] args)
    {
        char x = 'A';
        String y = "test";
        boolean z = true;
        System.out.println("main");
        m1(x,y,z);
        System.out.println("end");

    }
    public static void m1 (char x , String y , boolean z)
    {
        System.out.println("m1");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
