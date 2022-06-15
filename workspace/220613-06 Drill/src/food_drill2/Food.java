package food_drill2;

public class Food {
	private int cal;
	private int price;
	private int weight;
	
	public Food(int cal, int price, int weight) {
		super();
		this.cal = cal;
		this.price = price;
		this.weight = weight;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return "칼로리: " + cal + ", 가격: " + price + ", 중량: " + weight;
	}
}
