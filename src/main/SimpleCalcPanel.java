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
	JButton[] btnNum = new JButton[11];

	// オペレーションボタン
	JButton[] btnOperation = new JButton[6];

	JLabel label = new JLabel("0");
	JTextField textField = new JTextField("");

	public SimpleCalcPanel() {
		for (int i = 0; i < btnNum.length - 1; i++) {
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

		for (int i = 0; i < btnOperation.length; i++) {
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

	/*
	 * キー入力処理
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO: キー入力処理を追加する
	}

	/*
	 * ボタンの隙間の幅を指定して並べる
	 */
	public void layout(int aperture) {
		// レイアウトなし
		this.setLayout(null);
		int wTmp = this.getWidth(); // 幅取得
		int hTmp = this.getHeight(); // 高さ取得
		int height = (hTmp - aperture * 7) / 6; // 7か所の隙間に6つ並べる
		int y = aperture;
		this.label.setBounds(aperture, y, wTmp - aperture * 2, height);

		int btnWidth = (wTmp - aperture * 5) / 4; // 1つのボタン幅
		int x;

		y += height + aperture; // 次の行へ
		x = aperture;
		this.btnNum[7].setBounds(x, y, btnWidth, height);
		x += btnWidth + aperture;
		this.btnNum[8].setBounds(x, y, btnWidth, height);
		x += btnWidth + aperture;
		this.btnNum[9].setBounds(x, y, btnWidth, height);
		x += btnWidth + aperture;
		this.btnOperation[1].setBounds(x, y, btnWidth, height);
		int xEnd = x + btnWidth; // 右端ボタンの右端座標

		y += height + aperture; // 次の行へ
		x = aperture;
		this.btnNum[4].setBounds(x, y, btnWidth, height);
		x += btnWidth + aperture;
		this.btnNum[5].setBounds(x, y, btnWidth, height);
		x += btnWidth + aperture;
		this.btnNum[6].setBounds(x, y, btnWidth, height);
		x += btnWidth + aperture;
		this.btnOperation[2].setBounds(x, y, btnWidth, height);

		y += height + aperture; // 次の行へ
		x = aperture;
		this.btnNum[1].setBounds(x, y, btnWidth, height);
		x += btnWidth + aperture;
		this.btnNum[2].setBounds(x, y, btnWidth, height);
		x += btnWidth + aperture;
		this.btnNum[3].setBounds(x, y, btnWidth, height);
		x += btnWidth + aperture;
		this.btnOperation[3].setBounds(x, y, btnWidth, height);

		y += height + aperture; // 次の行へ
		x = aperture;
		this.btnNum[0].setBounds(x, y, btnWidth, height);
		x += btnWidth + aperture;
		this.btnNum[10].setBounds(x, y, btnWidth, height);
		x += btnWidth + aperture;
		this.btnOperation[0].setBounds(x, y, btnWidth, height);
		x += btnWidth + aperture;
		this.btnOperation[4].setBounds(x, y, btnWidth, height);

		y += height + aperture; // 次の行へ
		x = aperture;
		this.textField.setBounds(xEnd, y, btnWidth, height);
		x += this.textField.getWidth() + aperture;
		this.btnOperation[5].setBounds(x, y, (xEnd - x), height);
	}
}
