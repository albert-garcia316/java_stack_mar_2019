import java.util.HashMap;

public class HashmatiqueTest {
    public static void main(String[] args) {
        Hashmatique trackList = new Hashmatique();
        trackList.addTrack("Sweet Home Alabama", "Sweet home Alabama");
        trackList.addTrack("Sweet Child of Mine", "Sweet child of mine");
        trackList.addTrack("Title 3", "Song 3's lyrics");
        trackList.addTrack("Title 4", "Song 4's lyrics");
        trackList.getTrack("Sweet Home Alabama");
        trackList.showAll();
    }
}