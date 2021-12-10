public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(); // 顺序容器
		a.add("first");
		a.add("second");
		a.add("first");
		System.out.println(a); // 因为ArratList中有public String toString()方法，所以可以直接输出
    // 输出 [first, second, first]
		System.out.println("---------------");
		HashSet<String> b = new HashSet<String>(); // 集合
		b.add("first");
		b.add("second");
		b.add("first");
		System.out.println(b); 
  // 输出 [first, second], 实际上是无序的
}
