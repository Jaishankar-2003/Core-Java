package collection.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap
{
    public static void main(String[] args)
    {
        // Create a LinkedHashMap
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();

        // Add some products
        linkedMap.put(101, "Laptop");
        linkedMap.put(102, "Smartphone");
        linkedMap.put(103, "Tablet");
        linkedMap.put(104, "Headphones");

        // Print the map
        System.out.println("Products (Insertion Order): " + linkedMap);

        // Access a value
        System.out.println("Product 102: " + linkedMap.get(102));

        // Remove a key
        linkedMap.remove(103);

        // Add another one
        linkedMap.put(105, "Smartwatch");

        // Print again
        System.out.println("After modifications: " + linkedMap);
    }
}
