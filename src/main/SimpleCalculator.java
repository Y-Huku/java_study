package main;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class SimpleCalculator extends JFrame {

	Container container = getContentPane();
	SimpleCalcPanel panel = new NomalCalcPanel();

	public SimpleCalculator() {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("SimpleCalculator");

		this.container.add(panel, BorderLayout.CENTER);
		
		// フレームのサイズ変更管理
//		this.setResizable(false);
		
		// フレームのサイズ指定
		this.setBounds(0, 0, 250, 250);
		this.setVisible(true);
		
		// フレームを最前面に表示する
		this.setAlwaysOnTop(true);
		
		

	}

	public static void main(String[] args) {
		JFrame frame = new SimpleCalculator();
	}

}
