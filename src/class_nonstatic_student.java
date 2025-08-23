class student
{
    int id;
    String name;
    double marks;
    static String cname;   // non-static variable
}
public class class_nonstatic_student
{
    public static void main(String[] args)     // static method
    {
        student.cname = "QSP";

        System.out.println("------s1-------");

        student s1 = new student();      // object creation statement

        s1.id = 1;
        s1.name = "test1";            // non-static variable access
        s1.marks = 25.1;
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        System.out.println(student.cname);    // static variable access

        System.out.println("-------s2-------");

        student s2 = new student();         // object creation statement

        s2.id = 2;
        s2.name = "test2";                 // non-static variable access
        s2.marks = 22.1;
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.marks);
        System.out.println(student.cname);     // static variable access
    }

}
