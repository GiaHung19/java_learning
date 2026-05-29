package package_demo.animals;  // <-- cùng package "package_demo.animals" với Animal.java

public class Cat extends Animal {

    public Cat(String name) {
        super(name, "Meow", "nhà", 4);
    }

    public void demo() {
        // ✅ private -> KHÔNG dùng được (getName() là getter thay thế)
        System.out.println("Tên: " + getName());

        // ✅ protected -> CÙNG package, dùng được
        System.out.println("Âm thanh: " + sound);

        // ✅ default -> CÙNG package, dùng được
        System.out.println("Môi trường: " + habitat);

        // ✅ public -> Luôn dùng được
        System.out.println("Số chân: " + legs);

        // ✅ protected method -> CÙNG package, dùng được
        showHabitat();
    }
}
