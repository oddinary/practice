
public class Staff {
	private String name;
	private int age;
	private String job;
	
	public Staff(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "스탭 [이름 =" + name + ", 나이 =" + age + ", 직종 =" + job + "]";	}
	
}
//어차피 직업이라는 필드를 가지고 있기 때문에 이런 클래스는 굳이 필요없다.

//class Trainer extends Staff{
//	public Trainer(String name, int age, String job) {
//		super(name, age, job);
//	}
//}
//class Manager extends Staff{
//	public Manager(String name, int age, String job) {
//		super(name, age, job);	
//	}
//
//}