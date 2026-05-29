package package_demo.pets;  // <-- package "package_demo.pets", KHÁC package với Animal

import package_demo.animals.Animal;  // phải import mới dùng được

public class Dog extends Animal {  // Dog KẾ THỪA Animal

    public Dog(String name) {
        super(name, "Woof", "nhà", 4);
    }

    public void demo() {
        // ❌ private -> không bao giờ dùng được từ ngoài
        // System.out.println(name);  // LỖI BIÊN DỊCH

        // ✅ protected -> KHÁC package nhưng là SUBCLASS, nên dùng được
        System.out.println("Âm thanh: " + sound);

        // ❌ default -> KHÁC package, không dùng được dù là subclass
        // System.out.println(habitat);  // LỖI BIÊN DỊCH

        // ✅ public -> Luôn dùng được
        System.out.println("Số chân: " + legs);

        // ✅ protected method -> là subclass, dùng được
        showHabitat();
    }
}
