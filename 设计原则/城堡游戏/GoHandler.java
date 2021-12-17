package castle;

public class GoHandler extends Handler {
	public GoHandler(Game game){
		super(game);
	}
	public boolean docmd(String t) {
		game.goRoom(t);
		return false;
	}
}
