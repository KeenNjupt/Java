public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(Integer.MAX_VALUE); // int类型最大值
		System.out.println(Math.pow(2, 3));   // 求幂次
		String s1 = in.next();// 读取字符串直到遇到空格、\t、回车、换行
		String s2 = in.nextLine(); // 读入一行 
		String s = new String("aaaa"); // s是该字符串的管理者
		String t = s;  // 使t管理s管理的字符串
		System.out.println(s1);
		System.out.println(s2);
	}
