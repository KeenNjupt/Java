package dome;

public class DVD extends Item{
	private String director;
	public DVD(String title, String director, int playingtime) {
		super(title, playingtime);
		this.director = director;
	}
	public void print() {
		System.out.print("DVD:");
		super.print(); // ���ø����е�ͬ������
		System.out.println("director:"+director);
	}
	
}
