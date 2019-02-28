import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    HashMap<String, String> map = new HashMap<String, String>();
    public void addTrack(String title, String lyrics){
        this.map.put(title, lyrics);
    }
    public void getTrack(String title){
        System.out.println(this.map.get(title));
    }
    public void showAll(){
        Set<String> keys = this.map.keySet();
        for(String key : keys){
            System.out.println(key + ": " + this.map.get(key));
        }
    }
}