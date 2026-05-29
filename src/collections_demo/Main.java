package collections_demo;

import collections_demo.list_demo.ArrayListDemo;
import collections_demo.list_demo.LinkedListDemo;
import collections_demo.set_demo.HashSetDemo;
import collections_demo.set_demo.TreeSetDemo;
import collections_demo.map_demo.HashMapDemo;
import collections_demo.map_demo.TreeMapDemo;
import collections_demo.queue_demo.QueueDemo;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== LIST ==========");
        ArrayListDemo.run();
        LinkedListDemo.run();

        System.out.println("\n========== SET ==========");
        HashSetDemo.run();
        TreeSetDemo.run();

        System.out.println("\n========== MAP ==========");
        HashMapDemo.run();
        TreeMapDemo.run();

        System.out.println("\n========== QUEUE ==========");
        QueueDemo.run();
    }
}
