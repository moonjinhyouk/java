package p166;
import java.util.InputMismatchException;
import java.util.Scanner;
public class n15 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int num1 = 0;
	        int num2 = 0;
	        boolean validInput = false;

	        // 첫 번째 정수 입력받기
	        while (!validInput) {
	            System.out.print("첫 번째 정수를 입력하세요: ");
	            try {
	                num1 = scanner.nextInt(); // 정수 입력
	                validInput = true; // 입력이 유효하면 루프 탈출
	            } catch (InputMismatchException e) {
	                System.out.println("정수가 아닙니다. 다시 입력하세요.");
	                scanner.next(); // 잘못된 입력을 소비하고 다음 입력을 받기 위해 스캐너를 초기화
	            }
	        }

	        validInput = false; // 두 번째 입력을 위해 유효성 초기화

	        // 두 번째 정수 입력받기
	        while (!validInput) {
	            System.out.print("두 번째 정수를 입력하세요: ");
	            try {
	                num2 = scanner.nextInt(); // 정수 입력
	                validInput = true; // 입력이 유효하면 루프 탈출
	            } catch (InputMismatchException e) {
	                System.out.println("정수가 아닙니다. 다시 입력하세요.");
	                scanner.next(); // 잘못된 입력을 소비하고 다음 입력을 받기 위해 스캐너를 초기화
	            }
	        }

	        // 곱 계산 및 출력
	        int product = num1 * num2;
	        System.out.println("두 수의 곱: " + product);

	        // 자원 해제
	        scanner.close();
	    }
	}