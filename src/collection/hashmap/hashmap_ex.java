package collection.hashmap;

import java.util.HashMap;

public class hashmap_ex
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Siva");
        map.put(102, "Arun");
        map.put(103, "Kavi");
        map.put(104, "Siva"); // duplicate value is allowed
        map.put(102, "Vijay"); // duplicate key overrides previous value

        System.out.println(map);
        System.out.println("Get key 101: " + map.get(101));
        System.out.println("Contains key 105? " + map.containsKey(105));
        System.out.println("Contains key 105? " + map.containsKey(101));
    }
}

