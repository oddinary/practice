package dicegame; // 다 소문자로 해야함

import java.util.*;

class DiceGame {
	int diceFace;
	int userGuess;
	
	private void rollDice() {
		Random random = new Random();
		// diceFace = (int)(Math.random() * 6) + 1;
		diceFace = random.nextInt(6) + 1;
	}
	private int getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	private boolean checkUserGuess() {
		if (diceFace == userGuess) {
			System.out.println("맞았습니다.");
			return true;
		}
		else {
			System.out.println("틀렸습니다.");
			return false;
		}
	}
	// 접근제한자를 통해서 노출이 불필요한 기능들을 감춘다.
	// 퍼블릭한 메소드에서 각각의 메소드들을 호출해서 흐름만 만든다.
	public void startPlaying() {
		while (true) {
		userGuess = getUserInput("예상값을 입력하시오: ");
		rollDice();
		boolean result = checkUserGuess();
		if (result) {
			System.out.println("프로그램 종료");
			break;
		}
		
		}
	}
}
public class DiceGameTest {

	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.startPlaying();

	}

}
