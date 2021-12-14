package dome;

public class DVD extends Item{
	private String director;
	public DVD(String title, String director, int playingtime) {
		super(title, playingtime);
		this.director = director;
	}
	public void print() {
		System.out.print("DVD:");
		super.print(); // 调用父类中的同名函数
		System.out.println("director:"+director);
	}
	
}
