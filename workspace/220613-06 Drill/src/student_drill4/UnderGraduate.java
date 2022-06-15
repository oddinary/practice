package student_drill4;

public class UnderGraduate extends Students {
	private String circle;

	public UnderGraduate(String name, int studentId, String major, int year, int numberOfCredits, String circle) {
		super(name, studentId, major, year, numberOfCredits);
		this.circle = circle;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}
	@Override
	public String toString() {
		return super.toString() + ", 동아리: "+ circle;
	}
}
