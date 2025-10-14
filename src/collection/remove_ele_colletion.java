package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class remove_ele_colletion
{
    public static void main(String[] args)
    {
        Collection<Integer> hs1 = new HashSet<>(Arrays.asList(1,2,3,4,5,5));
        System.out.println("Initial set" + hs1);

        hs1.remove(4);
        System.out.println("Initial set" + hs1);

        Collection<Integer> hs2 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        hs2.removeAll(hs2);
        System.out.println("Initial set" + hs2);




    }
}
