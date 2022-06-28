import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class ExitDialog extends JDialog {
	private boolean exit;
	
	public ExitDialog(JFrame owner) {
		super(owner, "종료", true);
		
		JPanel pnl = new JPanel();
		JButton btnYes = new JButton("종료");
		JButton btnNo = new JButton("취소");
		
		ActionListener actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				exit = (e.getSource() == btnYes);
				dispose();
			}
		};
		
		btnYes.addActionListener(actionListener);
		btnNo.addActionListener(actionListener);
		
		pnl.add(btnYes);
		pnl.add(btnNo);
		
		add(pnl);
		setSize(250,250);
	}
	public boolean showDialog() {
		setVisible(true);
		
		return exit;
	}
}

public class Main2 extends JFrame{
	public Main2() {
		
		addWindowListener(new WindowListener() { // 창에 관련한 이벤트 리스너(어댑터도 사용 가능)
			
			@Override
			public void windowOpened(WindowEvent e) {
			}
			
			@Override
			public void windowIconified(WindowEvent e) { // 최소화 했을 때
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) { // 최소화에서 돌렸을 때
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {	
			}
			
			@Override
			public void windowClosing(WindowEvent e) { // 닫으려고 할 때
//				ExitDialog dialog = new ExitDialog(Main2.this);
//				boolean result = dialog.showDialog();
//				if(result) {
//					setDefaultCloseOperation(EXIT_ON_CLOSE);
//				}
				int result = JOptionPane.showConfirmDialog(Main2.this, "종료하시겠습니까?", "종료 확인", JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.YES_NO_OPTION) {
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				}
//				JOptionPane.showInputDialog(Main2.this,"입력창");
			}
			
			@Override
			public void windowClosed(WindowEvent e) { // 닫혔을 때
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
		
		setSize(500,500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // 닫아도 아무일도 안일어남(이벤트는 발생하고 있음)
		
		
	}
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
