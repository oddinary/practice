import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MyCounter extends JFrame{
	private int number = 0;
	private int cnt = 0;
	
	public MyCounter() {
		super("카운터");
		
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("0");
		JButton btn = new JButton("1씩 증가");
		JButton btn2 = new JButton("1씩 감소");
		JButton btn3 = new JButton("2씩 증가");
		JButton btn4 = new JButton("2씩 감소");
		JButton btn5 = new JButton("0");
		JButton btn6 = new JButton("이 버튼을 10번 누르면 색이 바뀝니다.");
		JLabel lbl2 = new JLabel("0");

		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				number++;
				lbl.setText(String.valueOf(number));
				
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				number--;
				lbl.setText(String.valueOf(number));
				
			}
		});
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				number += 2;
				lbl.setText(String.valueOf(number));
				
			}
		});
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				number -= 2;
				lbl.setText(String.valueOf(number));
				
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				number = 0;
				lbl.setText(String.valueOf(number));
				
			}
		});
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cnt++;
				lbl2.setText(String.valueOf(cnt));
				if(cnt % 2 == 0) {
					pnl.setBackground(Color.orange);
				} else {
					pnl.setBackground(new Color(250, 232, 162));
				}
				
			}
		});
		
		pnl.add(lbl);
		pnl.add(btn3);
		pnl.add(btn);
		pnl.add(btn5);
		pnl.add(btn2);
		pnl.add(btn4);
		pnl.add(lbl2);
		pnl.add(btn6);
		
		add(pnl);
		
		setSize(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyCounter().setVisible(true);
	}
}
