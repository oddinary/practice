import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main7 extends JFrame{
	public Main7() {
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JPanel pnlBox = new JPanel();
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		
		JTextField tf1 = new JTextField(20); // 기본생성자(가로 길이)
		JTextField tf2 = new JTextField(20);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(tf1.getText());
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf2.getText();
				tf1.setText(text);
				JOptionPane.showMessageDialog(Main7.this, text); // 앞자리에는 컴포넌트의 참조를 적어줘야함 null일 경우 중앙에 뜸
			}
		});
		
		pnlTop.add(tf1);
		pnlTop.add(btn1);
		pnlBottom.add(tf2);
		pnlBottom.add(btn2);
		
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
		add(pnlBox);
		
		pack(); // 내부 컴포넌트 크기에 맞게 창크기를 조절해주는 메소드
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main7().setVisible(true);
	}
}
