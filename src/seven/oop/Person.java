package seven.oop;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
