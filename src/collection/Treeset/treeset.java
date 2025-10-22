package collection.Treeset;

import java.util.TreeSet;

public class treeset
{
    public static void main(String[] args)
    {
        TreeSet<Integer> numbers = new TreeSet<>();

        TreeSet<String> names = new TreeSet<>();

        names.add("Zara");
        names.add("Amit");
        names.add("John");
        names.add("Bob");
        names.add("Amit"); // Duplicate ignored

        System.out.println("Sorted Names: " + names);

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10); // Duplicate ignored

        System.out.println("TreeSet (Sorted): " + numbers);
    }
}

