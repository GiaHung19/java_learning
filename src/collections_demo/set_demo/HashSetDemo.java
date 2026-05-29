package collections_demo.set_demo;

import java.util.HashSet;

public class HashSetDemo {

    public static void run() {
        System.out.println("\n--- HashSet ---");

        HashSet<String> students = new HashSet<>();

        // Them phan tu
        students.add("An");
        students.add("Binh");
        students.add("Chi");
        students.add("An");    // trung -> HashSet tu dong bo qua
        students.add("Binh");  // trung -> bo qua
        System.out.println("Danh sach (khong trung): " + students);
        // Thu tu KHONG dam bao

        // Kiem tra
        System.out.println("Co 'An' khong? " + students.contains("An"));
        System.out.println("So luong: " + students.size());  // 3, khong phai 5

        // Xoa
        students.remove("Chi");
        System.out.println("Sau khi xoa 'Chi': " + students);

        // Dung tot cho: kiem tra ton tai, loai bo trung lap
    }
}
