package p166;
import java.util.Scanner;
public class n6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; // 크기가 10인 배열 선언

        // 양의 정수 10개 입력받기
        for (int i = 0; i < 10; i++) {
            System.out.print("양의 정수를 입력하세요 (" + (i + 1) + "/10): ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("자리수의 합이 9인 수는 다음과 같습니다:");
        // 자리수의 합이 9인 수 출력
        for (int num : numbers) {
            if (digitSum(num) == 9) {
                System.out.print(num + " ");
            }
        }

        // 자원 해제
        scanner.close();
    }

    // 자리수의 합을 계산하는 메서드
    private static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // 가장 오른쪽 자리수를 더함
            number /= 10; // 자리수를 줄임
        }
        return sum;
    }
}

