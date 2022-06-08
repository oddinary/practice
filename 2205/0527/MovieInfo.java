class Movie {
	String title;
	String score;
	String director;
	int publishYear;
	
	public movie(String t, double s, String d, int p) { //생성자를 생성
		// 필드를 초기화 하는 문장들이 들어갈수 있음. << 주 목적
		title = t;
		score = s;
		director = d;
		publishYear = p;
	}
	
	void printAll() {
		System.out.println("제목 : " + title + " | 평점 : " + score 
		+ " | 감독 : " + director + " | 발표된 연도 : " + year);
		
	}
}

public class MovieInfo {
	public static void main(String[] args) {
		Movie DS2 = new Movie(); // 생성자(constructor)가 초기화를 해줌.
								// 기본 생성자 : 필드를 기본 값으로 초기화
								// 정수형 : 0 , 실수형 : 0.0 ,  참조형  : null, 논리형 : false 
								// char의 경우에도 숫자 0에 해당하는 문자로 나온다.
		DS2.title = "닥터 스트레인지: 대혼돈의 멀티버스"; // 필드 초기화는 내가 명시적으로 해주지 않아도 된다
		DS2.score = 8.5;
		DS2.director = "샘 레이미";
		DS2.publishYear = 2022;
		
		DS2.printAll();
		
		Movie M2 = new Movie("새영화", 7.5, "감독", 2022);
		
		M2.printAll();
	}
}