package p166;
import java.util.Random;
import java.util.Scanner;
public class n14 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("엔터키를 눌러 게임을 시작하세요...");

        // 사용자가 엔터키를 누를 때까지 대기
        scanner.nextLine();

        // 랜덤하게 0, 1, 2 중 3개의 수 생성
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = random.nextInt(3); // 0, 1, 2 중 랜덤
        }

        // 생성된 숫자 출력
        System.out.println("생성된 숫자: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);

        // 모두 같은지 확인
        if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
            System.out.println("성공! 대박났어요!");
        } else {
            System.out.println("아쉽네요. 다시 시도하세요.");
        }

        // 자원 해제
        scanner.close();
    }
}
