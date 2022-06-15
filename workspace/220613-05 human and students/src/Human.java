public class Human {
	private String name;
	private int age;
	private String profession;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Human c = new Human("춘향", 18);
		Human m = new Human("몽룡", 21);
		Human s = new Human("사또", 50);
		
		System.out.println(c.toString());
		System.out.println(m.toString());
		System.out.println(s.toString());
	}
	
}
