package castle;

public class ByeHandler extends Handler {
	public ByeHandler(Game game){
		super(game);
	}
	public boolean docmd(String t) {
        return true;
	}
}
