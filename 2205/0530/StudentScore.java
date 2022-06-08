public class StudentScore {
	public static void main(String[] args){
		Student st1 = new Student ("이진호", 100, 100, 100);
		
		System.out.println(st1.getName());
		System.out.println(st1.getKor());
		System.out.println(st1.getEng());
		System.out.println(st1.getMath());
		st1.avg();
		System.out.println(st1.score());
		
		Student st2 = new Student ("이진수");
		System.out.println(st2.score());
		st2.setKor(90);
		st2.setEng(85);
		st2.setMath(95);
		System.out.println(st2.score());
	}
}