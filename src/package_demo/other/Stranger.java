package package_demo.other;  // <-- package "package_demo.other", KHÁC package, KHÔNG kế thừa

import package_demo.animals.Animal;

public class Stranger {

    public void demo() {
        Animal a = new Animal("Lion", "Roar", "rừng", 4);

        // ❌ private -> không dùng được
        // System.out.println(a.name);     // LỖI BIÊN DỊCH

        // ❌ protected -> khác package VÀ không phải subclass
        // System.out.println(a.sound);    // LỖI BIÊN DỊCH

        // ❌ default -> khác package
        // System.out.println(a.habitat);  // LỖI BIÊN DỊCH

        // ✅ public -> luôn dùng được
        System.out.println("Số chân: " + a.legs);
        System.out.println("Tên: " + a.getName());
        a.speak();
    }
}
