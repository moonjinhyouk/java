package p166;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class n16 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("양수를 공백으로 구분하여 입력하세요: ");

        String input = scanner.nextLine(); // 사용자 입력 받기
        String[] numbers = input.split(" "); // 공백을 기준으로 분리

        List<Integer> positiveNumbers = new ArrayList<>(); // 양수 저장할 리스트

        // 양수 확인 및 리스트에 추가
        for (String number : numbers) {
            try {
                int num = Integer.parseInt(number);
                if (num > 0) {
                    positiveNumbers.add(num); // 양수만 리스트에 추가
                }
            } catch (NumberFormatException e) {
                // 정수가 아닌 경우 무시
            }
        }

        // 평균 계산
        if (!positiveNumbers.isEmpty()) {
            double sum = 0;
            for (int num : positiveNumbers) {
                sum += num; // 합계 계산
            }
            double average = sum / positiveNumbers.size(); // 평균 계산
            System.out.println("양수의 평균: " + average);
        } else {
            System.out.println("양수가 입력되지 않았습니다.");
        }

        // 자원 해제
        scanner.close();
    }
}
