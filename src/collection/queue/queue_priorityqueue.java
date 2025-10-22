package collection.queue;

import java.util.PriorityQueue;

public class queue_priorityqueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(20);
        pq.add(30);

        System.out.println("PriorityQueue: " + pq);
        System.out.println("Removed (lowest first): " + pq.poll());
        System.out.println("Now: " + pq);
    }
}

