import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main7 {
	public static void main(String[] args) {
		Map<Integer, Set<Integer>> lotto = new LinkedHashMap<>();

		lotto.put(1000, new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
		lotto.put(1001, new HashSet<Integer>(Arrays.asList(7, 8, 9, 10, 11, 12)));
		lotto.put(1002, new HashSet<Integer>(Arrays.asList(11, 22, 33, 44, 15, 16)));

		// lotto.txt 를 만들어서 출력하는데
		// 1000 : [1,2,3,4,5,6] 형식으로 출력하세용

		File file = new File("d:\\jinho\\filetest\\lotto.txt");

		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new FileWriter(file));

			Set<Integer> keySet = lotto.keySet();
			for(Integer i : keySet) {
				pw.println(i + " : " + lotto.get(i));
			}
			
//			for (int i = 1000; i <= 1002; i++) {
//				pw.println(i + " : " + lotto.get(i).toString());
//			}
//			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}
}
