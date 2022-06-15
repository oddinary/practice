package phone_drill3;

public class Main {

	public static void main(String[] args) {
		Phone phone1 = new Phone("apple", 499, "3G");
		System.out.println(phone1.toString());
		
		SmartPhone iphone = new SmartPhone("apple", 999, "5G", "iOS", 16, 6, true, true);
		System.out.println(iphone.toString());
		SmartPhone iphoneSE3 = SmartPhoneFactory.iphoneSE3();
		System.out.println(iphoneSE3.toString());
	}

}
 