package p166;
import java.util.Random;
public class n7 {
	 public static void main(String[] args) {
	        int[] numbers = new int[10]; // 크기가 10인 배열 선언
	        Random random = new Random();
	        int sum = 0;

	        // 11~19 범위의 랜덤 정수 생성 및 배열에 저장
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = random.nextInt(9) + 11; // 11~19 범위의 랜덤 정수
	            sum += numbers[i]; // 합계 계산
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
	    }
	}
