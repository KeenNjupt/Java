package dome;

public class CD extends Item {
	private String artist;
	
	public CD(String title, String artist, int playingtime) {
		super(title,playingtime);
		this.artist = artist;
		
	}
	public void print() {
		System.out.print("CD:");
		super.print(); // 调用父类中的同名函数
		System.out.println("artist:"+artist);
	}
	public static void main(String[] args) {
		CD cd = new CD("the love","aaa",10);
		cd.print();
		
	}
}
