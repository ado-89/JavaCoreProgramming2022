package eight;

public class Movie {
    private String title;
    private String director;
    private int year;
    private double rate;


    public Movie(String title) {
        this.title = title;
    }
    public void setRate(double ocjena) {
        if (ocjena>10) {
           rate = 10;
        } else if (ocjena<0) {
            rate = 0;
        }else{
            rate = ocjena;
        }
    }

    public double getRate() {
        return rate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void printMovieInfo() {
        System.out.println("Director: " + director + ", Title: " + title);
    }
}
