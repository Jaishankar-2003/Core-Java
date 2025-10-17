package collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class access_by_get_arrayList
{
    public static void main(String[] args)
    {
        List<String> al = new ArrayList<>();

        al.add("singam");
        al.add("puli");
        al.add("addu");

        String first = al.get(0);
        String second = al.get(1);
        String third = al.get(2);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


    }
}
