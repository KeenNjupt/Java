package jtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Kgb {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JTable table = new JTable(new Kgbdata());
		JScrollPane pane = new JScrollPane(table);
		frame.add(pane);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗口则程序终止
		frame.setVisible(true);
		

	}

}
