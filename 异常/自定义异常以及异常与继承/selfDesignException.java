package exception;

class OpenException extends Exception{} // �Զ�����쳣��ΪException�������
class CloseException extends OpenException{}
class NewException extends Exception{}

class Newclass extends selfDesignException{
	public static void f() throws CloseException { // �����н���override�ĺ������������׳��ȸ���汾������쳣
	}
	public Newclass() throws CloseException,NewException{ // ����Ĺ��캯����������������׳��������쳣
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
	public static void readfile() throws OpenException, CloseException { //�����ú������׳��쳣���õ������Ĵ��������Ӧ�Ĵ���
		if(open()==-1) {
			throw new CloseException();
		}
	}
	public static void main(String[] args) {
		try {
			readfile();
		}catch(CloseException e) { // �쳣ƥ�����Ϊ���մ�����д˳��ƥ��
			System.out.println("Close");
		}catch (OpenException e) {
			e.printStackTrace();
			System.out.println("Open");
		}catch(Exception e) {   // ���Խ����������͵��쳣,��ϵͳ�е��쳣������Խ�磬���㣬��ָ��
			e.printStackTrace();
			System.out.println("Anything");
		}

	}

}
