import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main3 extends JFrame{
	public Main3() {
		JPanel pnl  = new JPanel();
		JRadioButton rdb1 = new JRadioButton("라디오1");
		JRadioButton rdb2 = new JRadioButton("라디오2");
		JRadioButton rdb3 = new JRadioButton("라디오3");
		ButtonGroup group = new ButtonGroup(); // 하나의 그룹으로 묶어줘야 하나만 선택하게 할 수 있음
		group.add(rdb1);
		group.add(rdb2);
		group.add(rdb3);
		
		rdb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("액션이벤트 발생");
				
			}
		});
		rdb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange() == ItemEvent.SELECTED);
			}
		});
		
		pnl.add(rdb1);
		pnl.add(rdb2);
		pnl.add(rdb3);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
