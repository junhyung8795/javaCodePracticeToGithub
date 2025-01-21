package javaCodePractice.dequeStackQueue.problem.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("doc1");
        queue.add("doc2");
        queue.add("doc3");

        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
    }
}
