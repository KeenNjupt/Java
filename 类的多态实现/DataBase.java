package dome;
import java.util.ArrayList;

public class DataBase {
	ArrayList<Item> itemlist = new ArrayList<Item>();
	public void add(Item item) {  // 实现多态，声明为父类类型的变量可以被父类类型及其子类型的对象赋值
		itemlist.add(item);		  // 但该变量真正管理的对象类型由程序运行时，真正传递来的对象类型决定,即实现了动态绑定
	}
	public void list() {
		for(Item item: itemlist) {
			item.print(); // 会根据item管理的实际对象类型，调用其对应的方法
		}
	}
	public static void main(String[] args) {
		DataBase db = new DataBase();
		db.add(new CD("the love","aaa",10));
		db.add(new DVD("love actually","bbb",20));
		db.list();
	}

}
