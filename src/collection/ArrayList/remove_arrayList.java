package collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class remove_arrayList
{
    public static void main(String[] args)
    {
        List<String> al = new ArrayList<>();
        al.add("geeks");
        al.add("geekd");

        al.add(1,"for");

        System.out.println(al);

        al.remove(1);
        System.out.println(al);

        al.remove("geekd");

        System.out.println(al);






    }
}
