package collection.ArrayList;

import java.util.*;

public class add_ele_colletion
{
    public static void main(String[] args)
    {
        Collection<Integer> l1 = new ArrayList<>(5);
        l1.add(15);
        l1.add(20);
        l1.add(25);

        for (Integer n : l1)
        {
            System.out.println("Number = " + n);
        }

        Collection<Integer> l2 = new ArrayList<>();
        l2.addAll(l1);

        System.out.println("The new ArrayList is: " + l2);
    }
}
