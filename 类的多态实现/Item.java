package dome;

public class Item {
	private String title;
	private int playingtime;
	
	public Item() {
		
	}
	public Item(String title,int playingtime) {
		super(); // 用来接收来自子类构造时传递的参数
		this.title = title;
		this.playingtime = playingtime;
	}
	public void print() {
		System.out.print(title);
	}
	
}
