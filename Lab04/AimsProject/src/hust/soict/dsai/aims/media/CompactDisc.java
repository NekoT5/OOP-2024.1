package hust.soict.dsai.aims.media;

import java.util.*;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track " + track.getTitle() + " is already in the CD.");
        } else {
            tracks.add(track);
            System.out.println("Track " + track.getTitle() + " added to the CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track " + track.getTitle() + " removed from the CD.");
        } else {
            System.out.println("Track " + track.getTitle() + " is not in the CD.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() {
        System.out.println("Playing CompactDisc: " + this.getTitle());
        System.out.println("Artist: " + this.getArtist());
        System.out.println("CD length: " + this.getLength() + " seconds");
        System.out.println("Tracks:");
        for (Track track : tracks) {
            track.play();
        }
    }
    
    public String toString() {
        return "CompactDisc [title=" + getTitle() + ", artist=" + getArtist() + ", tracks=" + tracks.size() + "]";
    }
}
