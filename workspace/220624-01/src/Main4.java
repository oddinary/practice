import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

// cm <-> inch 바꾸는 프로그램
public class Main4 extends JFrame {
	public Main4() {
		super("치수 변환기");
		JPanel pnl = new JPanel();
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JRadioButton rdb1 = new JRadioButton("cm → inch");
		JRadioButton rdb2 = new JRadioButton("inch → cm");
		JButton btnChange = new JButton("변환");
		JButton btnReset = new JButton("리셋");
		JTextField tfInput = new JTextField(10);
		JLabel lblResult = new JLabel();
		ButtonGroup group = new ButtonGroup();
		
		rdb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				lblResult.setText(
						"=         " + "inch");
				
			}
		});
		rdb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				lblResult.setText(
						"=         " + "cm");
				
			}
		});

		btnChange.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (tfInput.getText().equals("")) {
					JOptionPane.showMessageDialog(Main4.this, "빈칸이자너");
				} else if (rdb2.isSelected()) {
					lblResult.setText("= " + (Double.valueOf(tfInput.getText())) * 2.54 + "cm");
				} else if(rdb1.isSelected()) {
					lblResult.setText(
							"= " + Math.round((Double.valueOf(tfInput.getText())) / 2.54 * 100) / 100.0 + "inch");
				}

			}
		});
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tfInput.setText("");
				if (rdb2.isSelected()) {
					lblResult.setText("=        " + "cm");
				} else if(rdb1.isSelected()) {
					lblResult.setText("=        " + "inch");
				}
			}
		});
		rdb1.setSelected(true);

		group.add(rdb1);
		group.add(rdb2);

		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));

		pnlTop.add(rdb1);
		pnlTop.add(rdb2);
		pnlTop.add(btnChange);
		pnlTop.add(btnReset);
		pnlBottom.add(tfInput);
		pnlBottom.add(lblResult);

		pnl.add(pnlTop);
		pnl.add(pnlBottom);

		add(pnl);

		setSize(350, 120);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
