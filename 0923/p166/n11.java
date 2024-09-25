package p166;
import java.util.Random;
import java.util.Scanner;

public class n11 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int wrongAttempts = 0;

        System.out.println("구구단 퀴즈에 오신 것을 환영합니다!");

        while (wrongAttempts < 3) {
            int multiplier = random.nextInt(9) + 1; // 1부터 9까지의 랜덤한 수
            int multiplicand = random.nextInt(9) + 1; // 1부터 9까지의 랜덤한 수
            int correctAnswer = multiplier * multiplicand;

            // 문제 출제
            System.out.print(multiplier + " x " + multiplicand + " = ");
            int userAnswer = scanner.nextInt();

            // 정답 검사
            if (userAnswer == correctAnswer) {
                System.out.println("정답입니다!");
            } else {
                wrongAttempts++;
                System.out.println("틀렸습니다! (현재 틀린 횟수: " + wrongAttempts + ")");
            }
        }

        System.out.println("3번 틀리셨습니다. 프로그램을 종료합니다.");
        scanner.close();
    }
}
