package castle;

public class RandHandler extends Handler {
	public RandHandler(Game game){
		super(game);
	}
	public boolean docmd(String t) {
		System.out.println("this is rand command");
		
		game.setrand();
		return false;
	}
}
