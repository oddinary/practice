import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.border.CompoundBorder;
import javax.swing.SpringLayout;

public class Main2 extends JFrame{
	private int price;
	
	public Main2() {
		super("오점뭐");
		JPanel pnl = new JPanel();
		pnl.setBorder(null);
		JPanel pnlTop = new JPanel();
		JPanel pnlBottom = new JPanel();
		JPanel pnlLeft = new JPanel();
		JPanel pnlRight = new JPanel();
		JLabel lblPrice = new JLabel("가격: " + price + "원");		
		JCheckBox check1 = new JCheckBox("짜장면");
		JCheckBox check2 = new JCheckBox("짬뽕");
		JCheckBox check3 = new JCheckBox("볶음밥");
		JCheckBox check4 = new JCheckBox("탕수육");
		JButton btnAll = new JButton("전체선택");
		JButton btnDeAll = new JButton("전체취소");

		pnlBottom.setLayout(new BoxLayout(pnlBottom, BoxLayout.X_AXIS));
		pnlLeft.setLayout(new BoxLayout(pnlLeft, BoxLayout.Y_AXIS));
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		pnlTop.add(btnAll);
		pnlTop.add(btnDeAll);
		pnlBottom.add(pnlLeft);
		pnlBottom.add(pnlRight);
		pnlLeft.add(check1);
		pnlLeft.add(check2);
		pnlLeft.add(check3);
		pnlLeft.add(check4);
		SpringLayout sl_pnlRight = new SpringLayout();
		sl_pnlRight.putConstraint(SpringLayout.NORTH, lblPrice, 35, SpringLayout.NORTH, pnlRight);
		sl_pnlRight.putConstraint(SpringLayout.WEST, lblPrice, 25, SpringLayout.WEST, pnlRight);
		pnlRight.setLayout(sl_pnlRight);
		pnlRight.add(lblPrice);
		pnl.add(pnlTop);
		pnl.add(pnlBottom);
		
		btnAll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				check1.setSelected(true);
				check2.setSelected(true);
				check3.setSelected(true);
				check4.setSelected(true);
				
			}
		});
		btnDeAll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				check1.setSelected(false);
				check2.setSelected(false);
				check3.setSelected(false);
				check4.setSelected(false);
				
			}
		});
		
		check1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange();
				if (result == ItemEvent.SELECTED) {
					price += 2500;
				} else if (result == ItemEvent.DESELECTED) {
					price -= 2500;
				}
				lblPrice.setText("가격: " + price + "원");
			}
		});
		check2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange();
				if (result == ItemEvent.SELECTED) {
					price += 4000;
				} else if (result == ItemEvent.DESELECTED) {
					price -= 4000;
				}
				lblPrice.setText("가격: " + price + "원");
			}
		});
		check3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange();
				if (result == ItemEvent.SELECTED) {
					price += 4000;
				} else if (result == ItemEvent.DESELECTED) {
					price -= 4000;
				}
				lblPrice.setText("가격: " + price + "원");
			}
		});
		check4.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange();
				if (result == ItemEvent.SELECTED) {
					price += 10000;
				} else if (result == ItemEvent.DESELECTED) {
					price -= 10000;
				}
				lblPrice.setText("가격: " + price + "원");
			}
		});
		
		getContentPane().add(pnl);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
