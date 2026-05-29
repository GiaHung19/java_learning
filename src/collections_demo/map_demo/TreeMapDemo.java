package collections_demo.map_demo;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void run() {
        System.out.println("\n--- TreeMap ---");

        // TreeMap tu dong sap xep theo KEY
        TreeMap<String, String> phonebook = new TreeMap<>();

        phonebook.put("Chi", "0909-111");
        phonebook.put("An", "0909-222");
        phonebook.put("Dung", "0909-333");
        phonebook.put("Binh", "0909-444");

        // In ra -> key tu dong sap xep theo alphabet
        System.out.println("Danh ba (sap xep theo ten): " + phonebook);

        // Key dau tien / cuoi cung (theo alphabet)
        System.out.println("Ten dau tien: " + phonebook.firstKey());
        System.out.println("Ten cuoi cung: " + phonebook.lastKey());

        // Lay tat ca tu 'B' den truoc 'D' (theo alphabet)
        System.out.println("Tu B den D: " + phonebook.subMap("B", "D"));

        // So sanh HashMap vs TreeMap:
        // HashMap  -> nhanh hon (O(1)), key khong sap xep
        // TreeMap  -> cham hon (O(log n)), key sap xep tu dong
    }
}
