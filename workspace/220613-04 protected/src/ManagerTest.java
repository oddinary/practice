class Employee {
	public String name;
	String address;
	protected int salary;
	private int RRN;
	
	public Employee() {};
	
	public Employee(String name, String address, int salary, int RRN) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.RRN = RRN;
	}
	public String toString() {
	return name + "," + address + "," + RRN + "," + salary;
	}
}

class Manager extends Employee{
	private int bonus;
	
	public Manager() {
		super();
	}
	
	public Manager(String name, String address, int salary, int RRN) {
		super(name, address, salary, RRN);
		this.bonus = bonus;
	}
	public void printSalary() {
		System.out.println(name + "(" + address + "):" + (salary + bonus));
	}
	
	public void printRRN() {
//		System.out.println(RRN); // 오류! private는 서브클래스에서 접근 못함!
	}
}


public class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.printRRN();
	}
}
