import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame{
	public Main() {
		JPanel pnl = new JPanel();
		MouseListener listener = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스버튼을 땜");
				pnl.setBackground(Color.white);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 버튼을 누름");
				pnl.setBackground(Color.black);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				pnl.setBackground(Color.pink);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				pnl.setBackground(Color.orange);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					System.out.println("더블 클릭");
				}
				switch (e.getButton()) {
				case MouseEvent.BUTTON1 : {
					System.out.println("1번");
					break;
				} 
				case MouseEvent.BUTTON2 : {
					System.out.println("2번");
					break;
				} 
				case MouseEvent.BUTTON3 : {
					System.out.println("3번");
					break;
				} 
				}
				System.out.println("왼쪽 버튼인가요??" + SwingUtilities.isLeftMouseButton(e));
			}
		};
		MouseMotionListener motion = new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스가 움직입니다! " + e.getX() + "," + e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				
			}
		};
//		pnl.addMouseListener(listener);
		pnl.addMouseMotionListener(motion);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
