package castle;

public class HelpHandler extends Handler {
	public HelpHandler(Game game){
		super(game);
	}
	public boolean docmd(String t) {
		System.out.print("��·�������������������:");
		game.printhand();
		System.out.println();
        System.out.println("�磺\tgo east");
        return false;
	}
}
