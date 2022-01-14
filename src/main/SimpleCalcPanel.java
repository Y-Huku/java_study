package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SimpleCalcPanel extends JPanel implements ActionListener {

	// 数字用
	JButton []btnNum = new JButton[11];

	// オペレーションボタン
	JButton []btnOperation = new JButton[6];

	JLabel label = new JLabel("0");
	JTextField textField = new JTextField("");

	public SimpleCalcPanel() {
		for(int i=0; i<btnNum.length - 1; i++) {
			// 数字ボタン生成
			this.btnNum[i] = new JButton("" + i);
			this.add(this.btnNum[i]);
		}

		this.btnNum[10] = new JButton(".");
		this.add(this.btnNum[10]);

		btnOperation[0] = new JButton("+/-");
		btnOperation[1] = new JButton("/");
		btnOperation[2] = new JButton("*");
		btnOperation[3] = new JButton("-");
		btnOperation[4] = new JButton("+");
		btnOperation[5] = new JButton("=");

		for(int i=0; i<btnOperation.length; i++) {
			// オペレーションボタン生成
			this.add(this.btnOperation[i]);
		}

		this.add(this.label);

		// ラベルの背景色設定
		this.label.setBackground(new Color(255, 255, 100));

		// ラベルを不透明な状態にする
		this.label.setOpaque(true);

		// 右寄せ表示
		this.label.setHorizontalAlignment(SwingConstants.RIGHT);

		// フォント設定
		this.label.setFont(new Font(null, Font.BOLD, 24));

		// 文字列設定
		this.add(this.textField);

		// 右寄せ表示
		this.textField.setHorizontalAlignment(SwingConstants.RIGHT);

		// フォント設定
		this.textField.setFont(new Font(null, Font.BOLD, 24));
	}

	public void actionPerformed(ActionEvent e) {
		// キー入力処理
	}
}
