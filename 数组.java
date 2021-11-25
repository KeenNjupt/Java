public static void main(String[] args) {
		int[] a = new int[10]; // 变量a为数组变量，它只是放置数组元素的内存的管理者
		int[] b = a; // 变量b也为数组变量，此赋值表示它会管理a管理的数组
		b[0] = 5;   // 因为b和a管理同一个数组，b[0] = a[0]
		System.out.println(a[0]); // 输出5
		System.out.println(a.length); // 每个数组变量都有一个length变量表示数组的长度
	}
