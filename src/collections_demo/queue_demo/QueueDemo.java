package collections_demo.queue_demo;

import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void run() {
        System.out.println("\n--- Queue (hang doi FIFO) ---");

        // Queue FIFO: vao truoc ra truoc (nhu xep hang)
        Queue<String> line = new LinkedList<>();

        line.offer("Nguoi 1");   // them vao cuoi hang
        line.offer("Nguoi 2");
        line.offer("Nguoi 3");
        System.out.println("Hang doi: " + line);

        System.out.println("Dau hang (chua xoa): " + line.peek());
        System.out.println("Phuc vu: " + line.poll());   // lay va xoa dau hang
        System.out.println("Con lai: " + line);

        // --- PriorityQueue: uu tien ---
        System.out.println("\n--- PriorityQueue (uu tien) ---");

        // Mac dinh: so nho hon co uu tien cao hon
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println("Hang doi uu tien (chua xu ly): " + pq);

        System.out.print("Xu ly theo uu tien: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");  // luon lay phan tu nho nhat
        }
        System.out.println();

        // Ung dung thuc te:
        // Queue         -> xu ly request theo thu tu den
        // PriorityQueue -> benh nhan cap cuu duoc uu tien truoc
    }
}
