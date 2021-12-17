package castle;
import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String,Room> exits = new HashMap<String,Room>();

    public Room(String description) 
    {
        this.description = description;
    }
    public void setExit(String direction, Room r) {
    	exits.put(direction, r);
    }
    public void prompt() {
    	System.out.println("现在你在" + description);
        System.out.print("出口有：");
        for(String k : exits.keySet()) {
        	System.out.print(k+" ");
        }
        System.out.println();
    }
    public Room getnextroom(String direction) {
    	Room ret = null;
    	ret = exits.get(direction);
        return ret;
    }

    @Override
    public String toString()
    {
        return description;
    }
}
