package exception;

class OpenException extends Exception{} // 自定义的异常，为Exception类的子类
class CloseException extends OpenException{}
class NewException extends Exception{}

class Newclass extends selfDesignException{
	public static void f() throws CloseException { // 子类中进行override的函数不能声明抛出比父类版本更多的异常
	}
	public Newclass() throws CloseException,NewException{ // 子类的构造函数必须声明父类会抛出的所有异常
	}
}

public class selfDesignException {
	public selfDesignException() throws CloseException{}
	public static void f() throws CloseException{}
	public static int open() {
//		int[] a = new int[10];
//		a[10] = 10;
		return -1;
	}
	public static void readfile() throws OpenException, CloseException { //声明该函数会抛出异常，让调用它的代码给出相应的处理
		if(open()==-1) {
			throw new CloseException();
		}
	}
	public static void main(String[] args) {
		try {
			readfile();
		}catch(CloseException e) { // 异常匹配机制为按照代码书写顺序匹配
			System.out.println("Close");
		}catch (OpenException e) {
			e.printStackTrace();
			System.out.println("Open");
		}catch(Exception e) {   // 可以接受所有类型的异常,如系统中的异常类数组越界，除零，空指针
			e.printStackTrace();
			System.out.println("Anything");
		}

	}

}
