package seven.oop;

/** Klasa moze biti:
 * 1.Outer --> ima isti naziv kao i fajl koji predstavlja.
 * 2.Inner
 * Modifikatori vidljivosti:
 * 1. - public -  klasa javno dostupna svima.
 * 2. - protected - nasljedjivanje.
 * 3. - paketno privatni pristup -> bez kljucne rijeci.
 * 4. - private.
 */

public class Movie {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRate(double rate) {
        if (rate>10.0){
           this.rate=10.00;
        } else if (rate<0.0) {
            this.rate=0.0;
        }else{
            this.rate = rate;
        }
    }

    public double getRate() {
        return rate;
    }

    private String title;
    private String director;
    private int year;
    private double rate;
    /*
    public void ocijeniFilm(double ocjena) {
        if (ocjena>10.0){
            rate=10.00;
        } else if (ocjena<0.0) {
            rate=0.0;
        }else{
            rate = ocjena;
        }
    }
    public double getRate() {
        return rate;
    }*/


}
