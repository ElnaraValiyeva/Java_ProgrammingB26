package day60_collection;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(2);
        queue.add(4);
        System.out.println(queue);

        queue.offer(30);
        System.out.println(queue);
    }
}
