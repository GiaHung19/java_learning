package collections_demo.list_demo;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void run() {
        System.out.println("\n--- LinkedList ---");

        LinkedList<String> queue = new LinkedList<>();

        // Them vao dau / cuoi danh sach
        queue.addLast("Nguoi 1");
        queue.addLast("Nguoi 2");
        queue.addLast("Nguoi 3");
        queue.addFirst("Nguoi 0 (chen ngang dau)");
        System.out.println("Hang doi: " + queue);

        // Xem phan tu dau/cuoi ma khong xoa
        System.out.println("Dau hang: " + queue.peekFirst());
        System.out.println("Cuoi hang: " + queue.peekLast());

        // Lay va xoa phan tu dau (nhu hang doi - FIFO)
        String served = queue.pollFirst();
        System.out.println("Phuc vu xong: " + served);
        System.out.println("Con lai: " + queue);

        // So sanh ArrayList vs LinkedList:
        // ArrayList  -> truy cap nhanh theo index (get(i))
        // LinkedList -> them/xoa dau-cuoi nhanh hon
    }
}
