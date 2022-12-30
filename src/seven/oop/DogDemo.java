package seven.oop;

public class DogDemo {
    public static void main(String[] args) {

        System.out.println(Dog.counter);

        Dog rex = new Dog("Roki", 43);
        System.out.println(rex.counter);
        Dog lesi = new Dog("Jonny", 64);

        System.out.println(rex.getName());
        System.out.println(lesi.getName());
    }
}
