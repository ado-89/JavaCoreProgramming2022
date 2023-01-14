package eight.oop;

import java.time.LocalDate;
import java.time.Month;

public class PersonTestDemo {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1989, Month.APRIL, 16);
        Person person = new Person(birthday);
        person.setName("Admir");
        person.setSurname("Rizvanovic");
        int age = person.getAge();
        System.out.println("Starost: " + age);

        Student student = new Student(LocalDate.of(2001, 3, 23));
        student.getAge();
    }
}
