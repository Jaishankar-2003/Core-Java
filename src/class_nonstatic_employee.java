class employee
{
    String name;
    int age;
    int salary;
    String designation;
    static String cname;       // static variable
}
public class class_nonstatic_employee
{
    public static void main(String[] args)
    {
        employee.cname = "jspcs";

        System.out.println("------s1--------");

        employee e1 = new employee();     // object creation structure
        e1.name = "test1";
        e1.age = 21;
        e1.salary = 12000;
        e1.designation = "test1";
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.salary);
        System.out.println(e1.designation);
        System.out.println(employee.cname);

        System.out.println("------s2--------");

        employee e2 = new employee();    // object creation structure
        e2.name = "test2";
        e2.age = 22;
        e2.salary = 13000;
        e2.designation = "test2";
        System.out.println(e2.name);
        System.out.println(e2.age);
        System.out.println(e2.salary);
        System.out.println(e2.designation);
        System.out.println(employee.cname);
    }
}
