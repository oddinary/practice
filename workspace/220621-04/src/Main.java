import java.time.LocalDate;

interface LeafletHandler {
	String give();
}
// 위의 인터페이스를 구형하는 클래스를 작성하세요. 추상메소드를 오버라이드 해야합니다. 구현바디는 (전화번호 문자열 또는 선거일 문자열 반환)
// 광고 전단지 제공자.
// 전화번호가 포함되어야함.
class onedayLoanAD implements LeafletHandler {
	private String phone;
	
	public onedayLoanAD(String phone) {
		super();
		this.phone = phone;
	}
	
	@Override
	public String give() {
		return phone;
	}
}

// 선거 전단지 제공자.
// 날짜가 포함되어야함.
class electionAD implements LeafletHandler {
	private LocalDate date;
	
	public electionAD(LocalDate date) {
		super();
		this.date = date;
	}
	
	@Override
	public String give() {
		return "투표날짜:" + date.toString();
	}
}


// 광고 대행사는 
// 일수광고 나 선거광고를 할 수 있다.
class AdCompany {
	LeafletHandler ad; // 둘다 인터페이스로 묶여 있다.(인터페이스로 필드를 만들었음)

	public AdCompany(LeafletHandler ad) {
		super();
		this.ad = ad;
	}

	public LeafletHandler getAd() {
		return ad;
	}

	public void setAd(LeafletHandler ad) {
		this.ad = ad;
	}
	public void consleAD() {
		System.out.println(ad.give());
	}
}

public class Main {
	public static void main(String[] args) {
//		LeafletHandler h1 = new advertiseLeaflet();
//		String 전화번호가 포함된 문자열 = h1.give();
//
//		LeafletHandler h2 = new electLeaflet();
//		String 선거날이 포함된 문자열 = h2.give();
//		
//		광고대행사 p = new 광고대행사 (일수광고);
		AdCompany cp = new AdCompany(new onedayLoanAD("010-1111-1111"));//(구현이 쉬워짐)
//		p.광고() << 일수 광고
		cp.consleAD();
		
//		p.set고객(선거광고)
		cp.setAd(new electionAD(LocalDate.now()));
		cp.consleAD();
//		p.광고 () << 선거광고
	}
}
