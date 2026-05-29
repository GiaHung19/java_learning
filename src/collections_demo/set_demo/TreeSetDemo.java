package collections_demo.set_demo;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void run() {
        System.out.println("\n--- TreeSet ---");

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(85);
        scores.add(42);
        scores.add(99);
        scores.add(67);
        scores.add(42);   // trung -> bo qua
        System.out.println("Diem (tu dong sap xep tang dan): " + scores);

        // Lay min / max
        System.out.println("Diem thap nhat: " + scores.first());
        System.out.println("Diem cao nhat: " + scores.last());

        // Lay tat ca phan tu nho hon 80
        System.out.println("Diem duoi 80: " + scores.headSet(80));

        // Lay tat ca phan tu lon hon hoac bang 67
        System.out.println("Diem tu 67 tro len: " + scores.tailSet(67));

        // So sanh HashSet vs TreeSet:
        // HashSet  -> nhanh hon (O(1)), khong sap xep
        // TreeSet  -> cham hon (O(log n)), tu dong sap xep
    }
}
