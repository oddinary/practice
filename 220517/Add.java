public class Add{
    public static void main(String args[]) {
	//int : 정수형 data type (자료형)
        int x; // 변수 선언(variable declare) 변수 = 기억을 위한 공간
        int y; 
        int sum; 

        // 초기화(initalize) : 변수에 제일 처음에 값을 대입하는 작업 (변수 사용시 꼭 해주어야함)
        x = 100; // 대입연산자 (assignment) 오른쪽에 있는걸 왼쪽에 집어 넣는다.
        y = 200;
        sum = x + y;

        System.out.println(sum);

        System.out.println(x - y);
        
        int minus;
        minus = x - y;
        System.out.println(minus);
    }
}