package dome;

public class Item {
	private String title;
	private int playingtime;
	
	public Item() {
		
	}
	public Item(String title,int playingtime) {
		super();
		this.title = title;
		this.playingtime = playingtime;
	}
	public void print() {
		System.out.print(title);
	}
	
}
