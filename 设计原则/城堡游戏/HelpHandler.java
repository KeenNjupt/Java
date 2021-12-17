package castle;

public class HelpHandler extends Handler {
	public HelpHandler(Game game){
		super(game);
	}
	public boolean docmd(String t) {
		System.out.print("迷路了吗？你可以做的命令有:");
		game.printhand();
		System.out.println();
        System.out.println("如：\tgo east");
        return false;
	}
}
