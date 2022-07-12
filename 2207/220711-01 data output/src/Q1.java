import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Q1 {
	public static void main(String[] args) {
		BufferedReader br = null;
		List<Integer> list = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(new File("d:\\jinho\\filetest\\int.txt")));
			String line;
			while ((line = br.readLine()) != null) {
				int n = Integer.valueOf(line);
				list.add(n);
			}
			System.out.println(list);
			Collections.sort(list);
			System.out.println(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		File file = new File("d:\\jinho\\filetest\\Int2.txt");

		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new FileWriter(file));
			for(Integer i : list) {
				pw.println(i);
			}
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
