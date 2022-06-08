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