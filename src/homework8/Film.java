package homework8;

public class Film {

    private String genre;

    private String name;

    private int year;

    private double rating;

    public Film(String genre, String name, int year, double rating) {
        this.genre = genre;
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public void printAllCollectionDeque() {

        System.out.printf("Movie: |%s| \"%s\", %d, rating is - %.1f \n", getGenre(), getName(),
                getYear(), getRating());
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
