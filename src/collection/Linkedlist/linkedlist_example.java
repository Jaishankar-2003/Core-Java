package collection.Linkedlist;

import java.util.LinkedList;

public class linkedlist_example
{
    public static void main(String[] args)
    {
        LinkedList<String> tasks = new LinkedList<>();

        // Add elements (like a todo list)
        tasks.add("Wake up");
        tasks.add("Brush teeth");
        tasks.add("Go to gym");

        // Add at beginning
        tasks.addFirst("Turn off alarm");

        // Add at end
        tasks.addLast("Sleep");

        // Remove element
        tasks.remove("Brush teeth");

        // Access first and last
        System.out.println("First Task: " + tasks.getFirst());
        System.out.println("Last Task: " + tasks.getLast());

        // Iterate
        for (String task : tasks)
            {
            System.out.println(task);
        }
    }
}

