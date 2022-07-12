import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

// 메모장 만들기
public class Main extends JFrame {
	public Main() {
		// 파일을 저장 할 수 있고, 파일을 선택할 수 있는 GUI창
		JPanel pnl = new JPanel();
		JFileChooser chooser = new JFileChooser();
		FileFilter filter = new FileFilter() {

			@Override
			public String getDescription() {
				return "텍스트 파일";
			}

			@Override
			public boolean accept(File f) {
				if (f.isDirectory())
					return true;
				return f.getName().endsWith(".txt");
			}

		};
		chooser.setFileFilter(filter);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));

		JPanel panel = new JPanel();

		JButton btnOpen = new JButton("열기");
		JButton btnSave = new JButton("저장");
		JTextArea ta = new JTextArea(15, 40);
		JScrollPane scrl = new JScrollPane(ta);

		ta.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 열기 창 int값을 반환함
				chooser.showOpenDialog(null);
				File file = chooser.getSelectedFile();
				BufferedReader br = null;

				String line;
				try {
					br = new BufferedReader(new FileReader(file));
					ta.setText("");
					while ((line = br.readLine()) != null) {
						ta.append(line + "\n");
					}

				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					try {
						br.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});

		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = chooser.showSaveDialog(null);

				if (result == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();

					PrintWriter pw = null;

					String txt = ta.getText();

					try {
						pw = new PrintWriter(new FileWriter(file));
						pw.println(txt);
						pw.flush();
					} catch (IOException e1) {
						e1.printStackTrace();
					} finally {
						if (pw != null) {
							pw.close();
						}
					}

				}
			}
		});

		panel.add(btnOpen);
		panel.add(btnSave);
		panel_1.add(panel);
		panel_1.add(scrl);
		pnl.add(panel_1);

		getContentPane().add(pnl);

		// 저장 창 int값을 반환함

		pack();
		setTitle("메모장");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
