import java.time.LocalTime;

public class MyZeroDivideException extends RuntimeException{ // Main5. 런타임 예외를 상속시켜주면 된다.
 //이렇게 상속으로 나만 쓸수 있는 예외를 만들수 있음
	public MyZeroDivideException(String message) {
		super(message + "," + LocalTime.now() + "에 발생하였음");// 시간정보도 볼수있게 만들수있겠죠??
	}

}
