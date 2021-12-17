package castle;

public class Handler {
	protected Game game;
	public Handler(Game game){
		super();
		this.game = game;
	}
	public boolean docmd(String t) {
		return false;
	}
}
