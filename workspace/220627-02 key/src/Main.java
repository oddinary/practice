import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	public Main() {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("입력");

		pnl.add(lbl);
		add(pnl);

		pnl.setFocusable(true);
		pnl.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) { // 하나의 키가 온전하게 입력이 되면 작동함.

			}

			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode(); // 입력한 키의 숫자값을 얻을수 있다.
				if (code == KeyEvent.VK_LEFT) {
					lbl.setLocation(lbl.getX() - 1,lbl.getY());
				} else if (code == KeyEvent.VK_RIGHT) {
					lbl.setLocation(lbl.getX() + 1,lbl.getY());
				} else if (code == KeyEvent.VK_UP) {
					lbl.setLocation(lbl.getX(),lbl.getY() - 1);
				} else if (code == KeyEvent.VK_DOWN) {
					lbl.setLocation(lbl.getX(),lbl.getY() + 1);
				}
				char c = e.getKeyChar();
				lbl.setText(String.valueOf(c));
			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
