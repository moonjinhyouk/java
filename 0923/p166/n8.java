package p166;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
public class n8 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 정수 개수 입력받기
        System.out.print("저장할 정수의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        // 정수 개수 유효성 검사
        if (count < 1 || count > 100) {
            System.out.println("1에서 100 사이의 정수를 입력해야 합니다.");
            return;
        }

        // 중복되지 않는 정수를 저장할 Set
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        // 랜덤한 정수 생성
        while (uniqueNumbers.size() < count) {
            int randomNumber = random.nextInt(100) + 1; // 1~100 범위의 랜덤 정수
            uniqueNumbers.add(randomNumber); // Set에 추가
        }

        // 배열로 변환
        int[] numbers = new int[count];
        int sum = 0;
        int index = 0;

        for (int number : uniqueNumbers) {
            numbers[index++] = number;
            sum += number; // 합계 계산
        }

        // 배열의 요소 출력
        System.out.println("배열의 요소:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // 평균 계산
        double average = (double) sum / numbers.length;

        // 평균 출력
        System.out.printf("\n평균: %.2f\n", average);

        // 자원 해제
        scanner.close();
    }
}
