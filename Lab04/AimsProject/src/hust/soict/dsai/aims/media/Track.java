package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }


    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength() + " seconds");
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference, objects are equal
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Null or different class type
        }
        Track other = (Track) obj; // Safe cast to Track
        return this.title != null && this.title.equals(other.title) && this.length == other.length;
    }
}
