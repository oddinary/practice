import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame{
	public Main4() {
		JPanel pnl = new JPanel(); // 그림을 불러와 보자
		
		Toolkit kit = Toolkit.getDefaultToolkit(); 
		
		URL url = Main4.class.getClassLoader().getResource("images/색상의차이.png");	// URL을 알려줌.
		ImageIcon image = new ImageIcon(kit.getImage(url));
		URL url2 = Main4.class.getClassLoader().getResource("images/rgb의차이.gif");	// URL을 알려줌.
		ImageIcon image2 = new ImageIcon(kit.getImage(url2));
		
//		Image image = kit.getImage("색상의차이.png");
//		Image image2 = kit.getImage("rgb의차이.gif");
		
		JLabel lbl = new JLabel(image);
		
		lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl.setIcon(image2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl.setIcon(image);
			}
		});
		
		pnl.add(lbl);
		
		add(pnl);
		
		setSize(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
