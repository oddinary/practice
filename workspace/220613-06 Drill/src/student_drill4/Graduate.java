package student_drill4;

public class Graduate extends Students{
	private String teachingType;
	private double scholarshipRate;
	
	public Graduate(String name, int studentId, String major, int year, int numberOfCredits, String teachingType,
			double scholarshipRate) {
		super(name, studentId, major, year, numberOfCredits);
		this.teachingType = teachingType;
		this.scholarshipRate = scholarshipRate;
	}

	public String getTeachingType() {
		return teachingType;
	}

	public void setTeachingType(String teachingType) {
		this.teachingType = teachingType;
	}

	public double getScholarshipRate() {
		return scholarshipRate;
	}

	public void setScholarshipRate(double scholarshipRate) {
		this.scholarshipRate = scholarshipRate;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 조교타입: "+ teachingType + ", 장학금 비율: " + scholarshipRate;
	}
}
