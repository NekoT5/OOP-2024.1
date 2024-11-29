
public class DigitalVideoDisc {
    private int id; // Add id field
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor with ID
    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.id= 0;    
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Constructor without ID, for other cases
    public DigitalVideoDisc(String title, String category, float cost) {
        this(-1, title, category, "", 0, cost); // default id as -1
    }

    // Constructor with only title
    public DigitalVideoDisc(String title) {
        this(title, "", 0.0f); // Using the other constructor with default values
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // toString method to return DVD details

    public String toString() {
        return "DVD-" + id + ": " + title + " - " + category + " - " + director + " - " + length + " minutes: " + cost + " $";
    }
    
    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase()); // Case-insensitive matching
    }
}
