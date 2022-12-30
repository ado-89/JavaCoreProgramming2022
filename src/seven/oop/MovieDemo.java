package seven.oop;

public class MovieDemo {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Indiana Jones");
        movie1.setDirector("Spielberg");
        movie1.setYear(1984);
        movie1.setRate(8.3);
        double rate = movie1.getRate();
        System.out.println(rate);


        Movie movie2 = new Movie();
        movie2.setTitle("Kill Bill");
        movie2.setDirector("Quentin Tarantino");
        movie2.setYear(2015);
        movie2.setRate(4.1);
        System.out.println(movie2.getRate());



    }

    public static class Person {
        public static void main(String[] args) {


        }
    }
}
