package cellmachine;

import javax.swing.Action;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import cell.Cell;
import field.Field;
import field.View;

public class CellMachine {
	private Field field;
	private JFrame frame;
	private View view;
	public CellMachine() {
		field = new Field(30,30);
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				field.place(row, col, new Cell());
			}
		}
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				Cell cell = field.get(row, col);
				if ( Math.random() < 0.2 ) {
					cell.reborn();
				}
			}
		}
		view = new View(field);
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Cells");
		frame.add(view);
		JButton jbstep = new JButton("单步");
		frame.add(jbstep,BorderLayout.NORTH);
		jbstep.addActionListener(new ActionListener() {  // 内部类和匿名类实现注入反转

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("按下了!");
				step();
				frame.repaint();
			}
			
		});
		frame.pack();
		frame.setVisible(true);
	}
	public void step() {
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				Cell cell = field.get(row, col);
				Cell[] neighbour = field.getNeighbour(row, col);
				int numOfLive = 0;
				for ( Cell c : neighbour ) {
					if ( c.isAlive() ) {
						numOfLive++;
					}
				}
//				System.out.print("["+row+"]["+col+"]:");
//				System.out.print(cell.isAlive()?"live":"dead");
//				System.out.print(":"+numOfLive+"-->");
				if ( cell.isAlive() ) {
					if ( numOfLive <2 || numOfLive >3 ) {
						cell.die();
//						System.out.print("die");
					}
				} else if ( numOfLive == 3 ) {
					cell.reborn();
//					System.out.print("reborn");
				}
				System.out.println();
			}
		}
//		System.out.println("UPDATE");
	}
	public void start(int n) {
		for ( int i=0; i<n; i++ ) {
			step();
			frame.repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		CellMachine CM = new CellMachine();
//		CM.start(100);
	}

}
