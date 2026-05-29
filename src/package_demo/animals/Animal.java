package package_demo.animals;  // <-- khai báo file này thuộc package "package_demo.animals"

public class Animal {

    private String name;        // chỉ class Animal mới dùng được
    protected String sound;     // subclass (dù khác package) cũng dùng được
    String habitat;             // default: chỉ trong package "animals"
    public int legs;            // mọi nơi đều dùng được

    public Animal(String name, String sound, String habitat, int legs) {
        this.name   = name;
        this.sound  = sound;
        this.habitat = habitat;
        this.legs   = legs;
    }

    public String getName() { return name; }

    public void speak() {
        System.out.println(name + " kêu: " + sound);
    }

    protected void showHabitat() {
        System.out.println(name + " sống ở: " + habitat);
    }
}
