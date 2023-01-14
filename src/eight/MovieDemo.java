package eight;

public class MovieDemo {
    public static void main(String[] args) {

        Movie movie = new Movie("Spiderman");
        movie.setDirector("Stan Lee");
        movie.setRate(1200);
        movie.setYear(1999);
        movie.printMovieInfo();

        Movie movie1 = new Movie("Batman");
        movie1.setDirector("Jason Tvin");
        movie1.setYear(2217);
        movie1.setRate(3);
        movie1.printMovieInfo();
    }


}
