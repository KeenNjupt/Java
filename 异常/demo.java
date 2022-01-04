package exception;


public class demo {
	public static void f() {
		int[] a = new int[10];
		a[10] = 10;  // 异常发生
	}
	public static void g() {
		f();
	}
	public static void h() {
		if(10>1) {
			g();
		}
	}
	public static void k() {
		try {
			h();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("in k()");
			throw e;//没有处理结束，将异常继续抛出
		}
	}
	public static void main(String[] args) {
		try {
			k();
			System.out.println("all is ok");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()); // 打印异常信息
			System.out.println(e);
			e.printStackTrace();   // 查看异常的发生与抛出过程
		}
		System.out.println("main");
	}

}
