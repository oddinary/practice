import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class Main3 extends JFrame{
	public Main3() {
		JPanel pink = new JPanel();
		pink.setBackground(Color.pink);
		JPanel orange = new JPanel();
		orange.setBackground(Color.orange);
		
		JTabbedPane tab = new JTabbedPane();
		tab.add("핑크",pink);
		tab.add("주황",orange);
		
		add(tab);
		
//		JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT,pink, orange);
//		split.setDividerLocation(350);
//		add(split);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
	}
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
