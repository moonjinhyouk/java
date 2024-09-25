package p161;
import java.util.Random;
import java.util.Scanner;


public class p161 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            // 숨겨진 숫자를 0에서 99까지 랜덤으로 생성
            int hiddenNumber = random.nextInt(100);
            int guess = -1;

            System.out.println("0에서 99 사이의 숫자를 맞춰보세요!");

            // 사용자가 정답을 맞출 때까지 반복
            while (guess != hiddenNumber) {
                System.out.print("숫자를 입력하세요: ");
                guess = scanner.nextInt();

                if (guess < hiddenNumber) {
                    System.out.println("더 높게");
                } else if (guess > hiddenNumber) {
                    System.out.println("더 낮게");
                } else {
                    System.out.println("축하합니다! " + hiddenNumber + "을 맞추셨습니다.");
                }
            }

            // 게임을 다시 할지 물어봄
            System.out.print("다시 하시겠습니까? (y/n): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("y");

        } while (playAgain);

        System.out.println("게임을 종료합니다. 감사합니다!");
        scanner.close();
    }
}