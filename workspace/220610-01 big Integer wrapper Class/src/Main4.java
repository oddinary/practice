import java.math.BigDecimal;
import java.math.BigInteger;

public class Main4 {
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		
		BigInteger value1 = new BigInteger("9223372036854775808");
		System.out.println(value1.add(new BigInteger("10")));
		
		System.out.println(value1);
		
		BigDecimal dec = new BigDecimal("0.123456789");
		System.out.println(dec);
		
		BigDecimal d = new BigDecimal(0.1);// 주의 : 이렇게 하지말고 "문자열"처럼 표현해야 한다.
	}
}
