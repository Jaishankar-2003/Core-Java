package collection.queue;

import java.util.ArrayDeque;

public class de_queue
{
    public static void main(String[] args)
    {
        ArrayDeque<String> dq = new ArrayDeque<>();

        dq.add("A");
        dq.add("B");
        dq.add("C");

        System.out.println("Queue: " + dq);

        dq.addFirst("Start");
        dq.addLast("End");

        System.out.println("After adding both ends: " + dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println("After removing both ends: " + dq);
    }
}

