import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("사용자가 버튼을 클릭했네요~");
	}
}

public class MyColorFrame extends JFrame{
	public MyColorFrame() {
		super("색깔 있는 프레임");
		
		JPanel pnl = new JPanel();
		pnl.setBackground(new Color(250, 232, 162));
		
		JButton btn = new JButton("컨테이너 안의 버튼");
		btn.addActionListener(new ActionListener() { // 지역클래스의 특징 = 지역변수에 접근할 수 있다.

			@Override
			public void actionPerformed(ActionEvent e) {
				pnl.setBackground(Color.orange);
			}
			
		});
		pnl.add(btn);
		
		
		pnl.add(new JButton("닫기"));
		
		add(pnl);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyColorFrame f = new MyColorFrame();
		f.setVisible(true);
	}
}
