import java.util.ArrayList;
import java.util.HashSet;

public class Song {
    private String title;
    private String artist;

    private HashSet<String> h;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        h = new HashSet<String>();
    }
    public String getTitle() {return title;}
    public String getArtist() {return artist;}

    public int howMany(ArrayList<String> names) {
        for (int i = 0; i < names.size(); ++i) {
            names.set(i, names.get(i).toLowerCase());
        }
        int beforeSize = h.size();
        h.addAll(names);
        return h.size() - beforeSize;
    }
}
