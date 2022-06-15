package student_drill4;

public class Students {
	private String name;
	private	int studentId;
	// 자바에서 0으로 시작하는 수는 8진수체계를 나타낸다.
	private	String major;
	private int year;
	private	int numberOfCredits;
	
	public Students(String name, int studentId, String major, int year, int numberOfCredits) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.major = major;
		this.year = year;
		this.numberOfCredits = numberOfCredits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}
	
	public String toString() {
		return "이름: "+ name + ", 학번: " + studentId + ", 학과: "+ major + ", 학년: " + year + ", 이수 학점 수: " + numberOfCredits;
	}
}
