class Date {
	int year;
	int month;
	int day;
	void printAll() {
		System.out.println("20" + year + "-" + month + "-" + day);
	}
	void print() {
		System.out.println(month + "/" + day + "/" + year);
	}
}

public class Today {
	public static void main(String[] args) {
		Date today = new Date();
		today.year = 22;
		today.month = 05;
		today.day = 27;
		today.printAll();
		today.print();
		
	}
}