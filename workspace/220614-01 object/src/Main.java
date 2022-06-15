// 컵라면  (제조사, 이름, 가격)
class Cupramen {
	private String company;
	private String name;
	private int price;
// 생성자, 게터 세터 생성	
	public Cupramen(String company, String name, int price) {
		this.company = company;
		this.name = name;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	
	// 다음 Object 클래스 메소드 Override(재정의) 해보기
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cupramen) {
			Cupramen other = (Cupramen) obj; 
			return company.equals(other.company) && name.equals(other.name);
		}
		else
			return false;
	}
	// toString	
	@Override
	public String toString() {
		return "Cupramen [company=" + company + ", name=" + name + ", price=" + price + "]";
	}
	
}
// equals - 제조사와 이름이 같으면
public class Main {
	public static void main(String[] args) {
		Cupramen c1 = new Cupramen("농심", "육개장", 900);
		Cupramen c2 = new Cupramen("삼양", "육개장", 900);
		Cupramen c3 = new Cupramen("농심", "신라면", 1400);
		Cupramen c4 = new Cupramen("농심", "육개장", 1000);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
	}
}
