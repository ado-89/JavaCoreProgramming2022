package eight.oop;

import java.time.LocalDate;
import java.time.Period;

public class Student extends Person{


    private String indexNumber;

    public Student(LocalDate birthday) {
       super(birthday);
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }



}
