package hust.soict.dsai.aims.media;
import java.util.*;

public class Book extends Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();
       

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

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public Book(int id, String title, String category, float cost) {
	    super(id, title, category, cost); // Call to the superclass constructor
	    this.authors = new ArrayList<>(); // Initialize the authors list after calling super
	}


    // Add author if not already present
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {  // Check if the author is already in the list
            authors.add(authorName);  // Add author to the list
            System.out.println(authorName + " added as an author.");
        } else {
            System.out.println(authorName + " is already an author.");
        }
    }

    // Remove author if present in the list
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {  // Check if the author is in the list
            authors.remove(authorName);  // Remove the author from the list
            System.out.println(authorName + " removed from authors.");
        } else {
            System.out.println(authorName + " is not an author of this book.");
        }
    }
    
    public String toString() {
        return "Book [title=" + getTitle() + ", authors=" + authors + "]";
    }

}
