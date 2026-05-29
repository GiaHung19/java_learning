package collections_demo.list_demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void run() {
        System.out.println("\n--- ArrayList ---");

        // Tao danh sach
        ArrayList<String> fruits = new ArrayList<>();

        // Them phan tu
        fruits.add("Xoai");
        fruits.add("Chuoi");
        fruits.add("Cam");
        fruits.add("Xoai");   // ArrayList cho phep trung
        System.out.println("Sau khi them: " + fruits);

        // Truy cap theo vi tri (index)
        System.out.println("Phan tu thu 0: " + fruits.get(0));
        System.out.println("Phan tu thu 2: " + fruits.get(2));

        // Sua phan tu
        fruits.set(1, "Dua hau");
        System.out.println("Sau khi sua index 1: " + fruits);

        // Xoa phan tu
        fruits.remove("Cam");
        System.out.println("Sau khi xoa 'Cam': " + fruits);

        // Kiem tra ton tai
        System.out.println("Co 'Xoai' khong? " + fruits.contains("Xoai"));

        // Duyet bang for-each
        System.out.print("Duyet: ");
        for (String f : fruits) {
            System.out.print(f + " | ");
        }
        System.out.println();

        // Sap xep
        Collections.sort(fruits);
        System.out.println("Sau khi sort: " + fruits);

        System.out.println("Kich thuoc: " + fruits.size());
    }
}
