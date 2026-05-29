package collections_demo.map_demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void run() {
        System.out.println("\n--- HashMap ---");

        // Map<Key, Value> -> luu tru theo cap key-value
        HashMap<String, Integer> scoreBoard = new HashMap<>();

        // Them cap key-value
        scoreBoard.put("An", 85);
        scoreBoard.put("Binh", 92);
        scoreBoard.put("Chi", 78);
        scoreBoard.put("An", 90);   // key "An" da ton tai -> ghi de gia tri cu
        System.out.println("Bang diem: " + scoreBoard);

        // Lay gia tri theo key
        System.out.println("Diem cua Binh: " + scoreBoard.get("Binh"));
        System.out.println("Diem cua Dung (khong co): " + scoreBoard.get("Dung")); // null

        // getOrDefault: tra ve gia tri mac dinh neu key khong ton tai
        int score = scoreBoard.getOrDefault("Dung", 0);
        System.out.println("Diem cua Dung (mac dinh 0): " + score);

        // Kiem tra key / value
        System.out.println("Co key 'Chi'? " + scoreBoard.containsKey("Chi"));
        System.out.println("Co value 78?  " + scoreBoard.containsValue(78));

        // Duyet toan bo Map
        System.out.println("Duyet tat ca:");
        for (Map.Entry<String, Integer> entry : scoreBoard.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }

        // Xoa
        scoreBoard.remove("Chi");
        System.out.println("Sau khi xoa 'Chi': " + scoreBoard);
    }
}
