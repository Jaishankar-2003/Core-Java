package collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class update_arrayList
{
    public static void main(String[] args)
    {
        List<String> al = new ArrayList<>();
        al.add("geek");
        al.add("geek");
        al.add(1,"for");

        System.out.println("initial config" + al);

        al.set(0,"study");

        System.out.println("initial config" + al);
    }
}