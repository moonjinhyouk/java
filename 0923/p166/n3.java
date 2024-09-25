package p166;
import java.util.Scanner;

public class n3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int number;

	        while (true) {
	            System.out.print("양의 정수를 입력하세요: ");
	            number = scanner.nextInt();

	            // 양의 정수인지 확인
	            if (number > 0) {
	                // 입력된 수만큼 '*' 출력
	                for (int i = 0; i < number; i++) {
	                    System.out.print("*");
	                }
	                System.out.println(); // 줄바꿈
	                break; // 반복 종료
	            } else {
	                System.out.println("양의 정수를 입력해야 합니다.");
	            }
	        }

	        scanner.close();
	    }
	}

