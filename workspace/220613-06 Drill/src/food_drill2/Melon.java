package food_drill2;

public class Melon extends Food{
	private String farm;

	public Melon(int cal, int price, int weight, String farm) {
		super(cal, price, weight);
		this.farm = farm;
	}

	public String getFarm() {
		return farm;
	}

	public void setFarm(String farm) {
		this.farm = farm;
	}
	
	public String toString() {
		return super.toString() + ", 경작농원: " + farm;
	}
}
