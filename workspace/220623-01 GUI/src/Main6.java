import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main6 extends JFrame {
	public Main6() {

		JPanel pnl = new JPanel(); // 패널은 기본값이 플로우레이아웃
//		FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
//		pnl.setLayout(flow);
//		BorderLayout border = new BorderLayout(); // 기본 설정이 자신의 영역에 가득채운다.
//		pnl.setLayout(border); // 다섯개의 영역에 나눠서 가질수있다.
//		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
//		pnl.setLayout(box);
//		GridLayout grid = new GridLayout(2,2); // 같은크기의 (행,열)로 나누어 준다.
//		pnl.setLayout(grid);
		pnl.setLayout(null); // 위치와 크기가 null로 설정 되기때문에 다 설정해줘야 하고 그래서 잘 안쓴다.

		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");

//		btn1.setPreferredSize(new Dimension(300,300));
//		btn1.setMinimumSize(new Dimension(300,300));
//		btn1.setMaximumSize(new Dimension(300,300));
		
		btn1.setLocation(10,30); // 시작지점이 좌 상단.
		btn1.setSize(200, 300);
		
		btn2.setBounds(220, 50, 70, 70);
		
		pnl.add(btn1, "west");
		pnl.add(btn2);
		pnl.add(btn3, "east");
		
		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main6().setVisible(true);
	}
}
