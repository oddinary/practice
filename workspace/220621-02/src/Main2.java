import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 학생
// 이름
// 나이

// 학생은 이름과 나이가 같으면 동일 학생입니다.

//도우너 33 학생의 인덱스를 찾아보세요.
class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int score;
	
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public int getScore() {
		return score;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		return score - o.score; // 점수를 기준으로 비교하게 만들어줌
	}

	
}

public class Main2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("고길동", 15, 90));
		list.add(new Student("둘리", 22, 80));
		list.add(new Student("도우너", 33, 95));
		System.out.println(list);
		
		System.out.println(list.contains(new Student("도우너",33)));
		System.out.println(list.indexOf(new Student("도우너",33, 0)));
		
		Collections.sort(list); // 정렬의 기준이 없으니까 에러남 기준을 만들기 위해서 implements Comparable<Student> 하고 override해주기
		System.out.println(list);
		
		Comparator<Student> comparator = new Comparator()<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		}; 
		
		Collection.sort(list.comparator);
		System.out.println(list);
	}
}
