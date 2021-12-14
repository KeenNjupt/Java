package dome;

public class CD extends Item {
	private String artist;
	
	public CD(String title, String artist, int playingtime) {
		super(title,playingtime); // 传递参数，来构造父类对应的那部分变量
		this.artist = artist;
		
	}
	public void print() {
		System.out.print("CD:");
		super.print(); // µ÷ÓÃ¸¸ÀàÖÐµÄÍ¬Ãûº¯Êý
		System.out.println("artist:"+artist);
	}
	public static void main(String[] args) {
		CD cd = new CD("the love","aaa",10);
		cd.print();
		
	}
}
