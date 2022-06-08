// 의자 클래스
// 제조사 생산일자 가격 모델명
public class Chair {
	String company;
	String date;
	int price;
	String name;
	
	public Chair(String c, String d, int p, String n) {
		company = c;
		date = d;
		price = p;
		name = n;
	}
	
	void printAll() {
		System.out.println(company);
		System.out.println(date);
		System.out.println(price);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Chair c = new Chair("허먼밀러", "2022-05-30", 2300000, "뉴 에어론");
		c.printAll();
	}
}