import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter2 extends JFrame implements ActionListener {

	private int number = 0;
	private int cnt = 0;
	private JButton btn;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JLabel lbl;

	public MyCounter2() {
		super("카운터");

		JPanel pnl = new JPanel();
		lbl = new JLabel("0");
		btn = new JButton("1씩 증가");
		btn2 = new JButton("1씩 감소");
		btn3 = new JButton("2씩 증가");
		btn4 = new JButton("2씩 감소");
		btn5 = new JButton("0");

		// 이벤트가 발생한 객체가 무엇인지 알아보게 하자

		btn.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);

		pnl.add(lbl);
		pnl.add(btn3);
		pnl.add(btn);
		pnl.add(btn5);
		pnl.add(btn2);
		pnl.add(btn4);

		add(pnl);

		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyCounter2().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) { // Object형으로 알려줌
			number++;
			lbl.setText(String.valueOf(number));
		} else if (e.getSource() == btn2) {
			number--;
			lbl.setText(String.valueOf(number));
		} else if (e.getSource() == btn3) {
			number += 2;
			lbl.setText(String.valueOf(number));
		} else if (e.getSource() == btn4) {
			number -= 2;
			lbl.setText(String.valueOf(number));
		} else {
			number = 0;
			lbl.setText(String.valueOf(number));
		}
	}

}
