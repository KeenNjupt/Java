package exception;


public class demo {
	public static void f() {
		int[] a = new int[10];
		a[10] = 10;  // �쳣����
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
			throw e;//û�д�����������쳣�����׳�
		}
	}
	public static void main(String[] args) {
		try {
			k();
			System.out.println("all is ok");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()); // ��ӡ�쳣��Ϣ
			System.out.println(e);
			e.printStackTrace();   // �鿴�쳣�ķ������׳�����
		}
		System.out.println("main");
	}

}
