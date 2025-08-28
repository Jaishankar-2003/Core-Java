class actor
{
    String name;
    int age;
    int nom;
    int noh;
    int nof;
    public actor(String a,int b , int c, int d , int e)
    {
        name = a;
        age = b;
        nom = c;
        noh = d;
        nof = e;
    }
}
public class constructor_actor
{
    public static void main (String[] args)
    {
        actor m1 = new actor("vijay" , 57 , 10 , 10 , 10);
        System.out.println(m1.name);
        System.out.println(m1.age);
        System.out.println(m1.nom);
        System.out.println(m1.noh);
        System.out.println(m1.nof);

        System.out.println("---------------");

        actor m2 = new actor("jai" , 22 , 10 , 10 , 10);
        System.out.println(m2.name);
        System.out.println(m2.age);
        System.out.println(m2.nom);
        System.out.println(m2.noh);
        System.out.println(m2.nof);

        System.out.println("---------------");

        actor m3 = new actor("suri" , 23 , 10 , 10 , 10);
        System.out.println(m3.name);
        System.out.println(m3.age);
        System.out.println(m3.nom);
        System.out.println(m3.noh);
        System.out.println(m3.nof);

        System.out.println("---------------");

        actor m4 = new actor("sasi" , 25 , 10 , 10 , 10);
        System.out.println(m4.name);
        System.out.println(m4.age);
        System.out.println(m4.nom);
        System.out.println(m4.noh);
        System.out.println(m4.nof);

        System.out.println("---------------");

        actor m5 = new actor("kanika" , 20 , 10 , 10 , 10);
        System.out.println(m5.name);
        System.out.println(m5.age);
        System.out.println(m5.nom);
        System.out.println(m5.noh);
        System.out.println(m5.nof);

    }
}
