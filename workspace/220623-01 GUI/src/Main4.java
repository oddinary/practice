import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main4 extends JFrame implements ActionListener {
	JButton btnEnable;
	JButton btnDisable;
	JButton btn;
	private List<JButton> list;

	public Main4() {
		super("버튼 활성화 테스터");
		list= new ArrayList<>();
		JPanel pnl = new JPanel();

		btnEnable = new JButton("활성화");
		btnDisable = new JButton("비활성화");
		JButton btnNotShown = new JButton("내가 보이니?");

		btnEnable.addActionListener(this);
		btnDisable.addActionListener(this);
//		btnDisable.setEnabled(false);
		btnNotShown.setVisible(false);

		pnl.add(btnEnable);
		pnl.add(btnDisable);
		pnl.add(btnNotShown);

		for (int i = 1; i <= 5; i++) {
			btn = new JButton(String.valueOf(i));
			pnl.add(btn);
			list.add(btn);
		}

		add(pnl);

		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnable) {
			for (JButton btn : list) {
				btn.setEnabled(true);
			}
		} else if (e.getSource() == btnDisable) {
			for (JButton btn : list) {
				btn.setEnabled(false);
			}
		}

	}
}
