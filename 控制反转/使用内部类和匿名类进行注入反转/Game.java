package castle;

import java.util.Scanner;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.HashMap;
import java.util.Random;

public class Game {
    private Room currentRoom;
    private HashMap<String,Handler> cmdhands = new  HashMap<String,Handler>();
    private HashMap<String,Room> rooms = new  HashMap<String,Room>();
    
    private class Handler{
    	public boolean docmd(String t) {
    		return false;
    	}
    }
    public Game() 
    {
        createRooms();
        addhandler();
    }
    public void setrand() {
    	Random r = new Random();
    	int i = r.nextInt(rooms.size()-1)+1;
    	Room rm = null;
    	for(String s : rooms.keySet()) {
    		if(i==0) {
    			rm = rooms.get(s);
    			break;
    		}
    		i--;
    	}
    	currentRoom = rm;
    	currentRoom.prompt();
    }
    private void addhandler() {
//    	cmdhands.put("help", new HelpHandler(this));
//    	cmdhands.put("bye", new ByeHandler(this));
//    	cmdhands.put("go", new GoHandler(this));
//    	cmdhands.put("rand", new RandHandler(this));
    	
    	cmdhands.put("help", new Handler() { // 内部类和匿名类
    		@Override
    		public boolean docmd(String t) {
    			System.out.print("迷路了吗？你可以做的命令有:");
        		printhand();
        		System.out.println();
                System.out.println("如：\tgo east");
                return false;
    		}
    	});
    	cmdhands.put("bye", new Handler() {
    		@Override
    		public boolean docmd(String t) {
                return true;
        	}
    	});
    	cmdhands.put("go", new Handler() {
    		@Override
    		public boolean docmd(String t) {
        		goRoom(t);
        		return false;
        	}
    	});
    	cmdhands.put("rand", new Handler() {
    		@Override
    		public boolean docmd(String t) {
        		System.out.println("this is rand command");
        		setrand();
        		return false;
        	}
    	});
    }
    private void addroom(String s) {
    	rooms.put(s, new Room(s));
    }
    private void setdoublexit(String s1, String s2, String dir1, String dir2) {
    	rooms.get(s1).setExit(dir1, rooms.get(s2));
    	rooms.get(s2).setExit(dir2, rooms.get(s1));
    }
    private void createRooms()
    {
//        Room outside, lobby, pub, study, bedroom;
      
        //	制造房间
//        outside = new Room("城堡外");
//        lobby = new Room("大堂");
//        pub = new Room("小酒吧");
//        study = new Room("书房");
//        bedroom = new Room("卧室");
        addroom("城堡外");
        addroom("大堂");
        addroom("小酒吧");
        addroom("书房");
        addroom("卧室");
        
        //	初始化房间的出口
//        outside.setExit("east", lobby);
//        lobby.setExit("west", outside);
//        outside.setExit("south", study);
//        study.setExit("north", outside);
//        outside.setExit("west", pub);
//        pub.setExit("east", outside);
//        study.setExit("east", bedroom);
//        bedroom.setExit("west", study);
//        outside.setExit("up", bedroom);
//        bedroom.setExit("down", outside);
        setdoublexit("城堡外","大堂","east","west");
        setdoublexit("城堡外","书房","south","north");
        setdoublexit("城堡外","小酒吧","west","east");
        setdoublexit("书房","卧室","east","west");
        setdoublexit("城堡外","卧室","up","down");
        

        currentRoom = rooms.get("城堡外");  //	从城堡门外开始
    }
    
    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        currentRoom.prompt();
    }

    // 以下为用户命令
    public void printhand() {
    	for(String s : cmdhands.keySet()) {
    		System.out.print(" "+s);
    	}
    }
    public void goRoom(String direction) 
    {
        Room nextRoom = null;
        nextRoom = currentRoom.getnextroom(direction);
        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            currentRoom.prompt();
        }
    }
    private void play() {
    	Scanner in = new Scanner(System.in);
    	while ( true ) {
    		String line = in.nextLine();
    		String[] words = line.split(" ");
    		String value = "";
    		Handler hand = cmdhands.get(words[0]);
    		if(hand==null) {
    			System.out.println("请输入正确的命令");
    			continue;
    		}
    		if(words.length>1) {
    			value = words[1];
    		}
    		if(hand.docmd(value)) break;
    }
}
	
	public static void main(String[] args) {
		
		Game game = new Game();
		game.printWelcome();

        game.play();
        System.out.println("感谢您的光临。再见！");
	}

}
