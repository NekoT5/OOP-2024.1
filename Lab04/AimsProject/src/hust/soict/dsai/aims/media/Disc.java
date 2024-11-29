package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    // Constructor
    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost); // Call superclass constructor
        this.length = length;
        this.director = director;
    }

    // Getter for length
    public int getLength() {
        return length;
    }

    // Getter for director
    public String getDirector() {
        return director;
    }
}
