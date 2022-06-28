import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class SubWindow extends JDialog {
	private JTextField tf;

	public SubWindow(JFrame owner) {
		super(owner, true);

		setTitle("다른 창");

		tf = new JTextField(10);
		add(tf, "North");

		JButton btn = new JButton("다른 버튼");
		add(btn);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});

		setSize(300, 300); // exit_on_close 하면 런타임 에러 발생함
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 추가창만 종료(기본 값임)
	}

	public String showDialog() {
		setVisible(true);

		return tf.getText();
	}
}

public class Main extends JFrame {
	public Main() {
		super("주요 창");
		JButton btn = new JButton("버튼");
		add(btn);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SubWindow dialog = new SubWindow(Main.this);
				String result = dialog.showDialog();
				// modal값에 따라 달라진다.
				System.out.println("이 문장은 언제 호출될까?"); // 위의 dialog를 닫을 때 호출이 된다.(modal : true)
				btn.setText(result);
			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
