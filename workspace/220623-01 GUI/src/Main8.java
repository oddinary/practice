import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

// 사용자 입력을 받을수 있는 GUI를 만들고 
// 간단한 더하기 문제(랜덤한 정수) 문제영역
// 입력 받는 영역, 확인 버튼 , 정답, 오답 확인하는 란
// 다 되면 다시 하는 기능도 만들어 보기
public class Main8 extends JFrame{
	public Main8() {
		Random r = new Random();
		int a = r.nextInt(9) + 1;
		int b = r.nextInt(9) + 1;
		JLabel lbl = new JLabel(a + " + " + b + " = ? ");
		JTextField tf = new JTextField(20);
		JButton btn1 = new JButton("제출");
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JPanel pnlBox = new JPanel();
		
		BoxLayout box = new BoxLayout(pnlBox,BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tf.getText().equals(String.valueOf(a + b))) {
					JOptionPane.showMessageDialog(Main8.this, "정답입니다.");
				} else {
					JOptionPane.showMessageDialog(Main8.this, "오답입니다.");
				}
			}
		});
		
		pnlTop.add(lbl);
		pnlBottom.add(tf);
		pnlBottom.add(btn1);
		
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
		add(pnlBox);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Main8().setVisible(true);
	}
}
