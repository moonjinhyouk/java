package p166;
import java.util.Scanner;
public class n5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; // 크기가 10인 배열 선언

        // 양의 정수 10개 입력받기
        for (int i = 0; i < 10; i++) {
            System.out.print("양의 정수를 입력하세요 (" + (i + 1) + "/10): ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("3의 배수는 다음과 같습니다:");
        // 3의 배수 출력
        for (int num : numbers) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }
        
        // 자원 해제
        scanner.close();
    }
}

