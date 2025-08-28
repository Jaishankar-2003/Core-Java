class test
{
    String name;
    int age;
    int salary;      // non-static var
    static String cname = "wipro";       // static var

    public test(String a, int b , int c) // constructor
    {
        name = a;
        age = b;        // local variable
        salary = c;
    }
}
public class constructor_employee
{
    public static void main (String[] args)
    {
        test m1 = new test("a" , 21 , 1000);  // object creation call constructor
        System.out.println(m1.name);
        System.out.println(m1.age);
        System.out.println(m1.salary);
        System.out.println(test.cname);

        System.out.println("---------------");

        test m2 = new test("b" , 22 , 2000);
        System.out.println(m2.name);
        System.out.println(m2.age);
        System.out.println(m2.salary);
        System.out.println(test.cname);

        System.out.println("---------------");

        test m3 = new test("c" , 23 , 3000);
        System.out.println(m3.name);
        System.out.println(m3.age);
        System.out.println(m3.salary);
        System.out.println(test.cname);

    }
}
