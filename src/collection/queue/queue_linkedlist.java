package collection.queue;

import java.util.*;

public class queue_linkedlist
{
    public static void main(String[] args)
    {
        Queue<String> line = new LinkedList<>();

        line.add("Person 1");
        line.add("Person 2");
        line.add("Person 3");

        System.out.println("Initial Queue: " + line);

        System.out.println("Serving: " + line.remove()); // removes Person 1
        System.out.println("Next in line: " + line.peek()); // shows Person 2
        System.out.println("Queue now: " + line);
    }
}

