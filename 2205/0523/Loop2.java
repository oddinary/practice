public class Loop2{
	public static void main(String[] args) {
		// int i = 1;
		// while (i <= 10000) {
			// System.out.println(i);
			// i++;
		// }
		
		// int j = 20;
		// while (j <= 29) {
			// System.out.println(j);
			// j++;
		// }
		
		// int k = 10;
		// while (k >= 0) {
			// System.out.println(k);
			// k--;
		// }
		
		// int l = 0;
		// while (l < 100) {
			// System.out.println(l);
			// l += 3;
		// }
		
		int m = 0;
		while (m < 11){
			if (m % 2 == 0)	System.out.println("☆");
			else System.out.println("★");
			//System.out.println ((q % 2 == 0) ? "☆" : "★");
			m++;
		}
	}
}