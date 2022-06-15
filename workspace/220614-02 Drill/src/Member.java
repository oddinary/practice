
public class Member {
	private String name;
	private double height;
	private double weight;
	
	public Member(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public Member() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getBmi() {
		return  weight / (height * height);
	}
	
	public String getState() {
		if (getBmi() >= 35) 
			return "고도비만";
		else if (getBmi() >= 30)
			return "중도비만";
		else if (getBmi() >= 25)
			return "경도비만";
		else if (getBmi() >= 23)
			return "과체중";
		else if (getBmi() >= 18.5)
			return "정상";
		else
			return "저체중";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member other = (Member) obj; 
			return name.equals(other.name) && height == (other.height) && weight == (other.weight);
		}
		else
			return false;
	}

	@Override
	public String toString() {
		return "Member [이름=" + name + ", 키(M)=" + height + ", 몸무게(kg)=" + weight + ", bmi=" + getBmi() + ", 비만지수=" + getState() + "]";
	}
	
	
}
