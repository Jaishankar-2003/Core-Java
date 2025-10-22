package collection.ArrayList;

import java.util.ArrayList;

public class arraylist_ex
{
    public static void main(String[] args)
    {
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Insert in between
        fruits.add(1, "Mango");
        fruits.add(3 , "sapota");

        // Access elements (random access)
        System.out.println("Fruit at index 2: " + fruits.get(2));
        System.out.println("Fruit at index 3: " + fruits.get(3));

        // Remove element
        fruits.remove("Banana");

        // Iterate
        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
}
