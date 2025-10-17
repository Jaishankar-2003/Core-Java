package collection.ArrayList;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

public class Add_arrayList
{
    public static void main(String[] args)
    {
        List<String> al = new ArrayList<>();

        al.add("geek");
        al.add("geek");
        al.add(1,"for");

        for(String s : al)
        {
            System.out.print(s);
        }

    }
}
