package hello;

public class StudentScore {
	public static void main(String[] args){
		Student st1 = new Student ("이진호", 100, 100, 100);
		Student st2 = new Student ("이진수", 90, 85, 95);
		Student st3 = new Student("이진무", 80, 80, 80);
		
		ClassRoomA room = new ClassRoomA(st1, st2, st3);
		System.out.println(room.getStu1().getName());
		room.printNames();
		int cAvg = room.getTotalAvg();
		
//		System.out.println(st1.score());
//		System.out.println(st2.score());
//		System.out.println(st3.score());
		}
}