package hust.soict.dsai.aims.media;

public abstract class Media {
    // Fields common to both Book and DigitalVideoDisc
    private int id;
    private String title;
    private String category;
    private float cost;

    // Constructor to initialize the common fields
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Getters and Setters for the fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference, objects are equal
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Null or different class type
        }
        Media other = (Media) obj; // Safe cast to Media
        return this.title != null && this.title.equals(other.title);
    }
    
    public String toString() {
        return "Media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
    }
}
