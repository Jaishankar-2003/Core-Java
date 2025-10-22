package collection.Linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedhashset
{
    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        String[] fruits = {"Banana", "Apple", "Mango", "Orange", "Apple"};

        for (String fruit : fruits)
        {
            hashSet.add(fruit);
            linkedHashSet.add(fruit);
        }

        System.out.println("HashSet (Unordered): " + hashSet);
        System.out.println("LinkedHashSet (Ordered): " + linkedHashSet);
    }
}

