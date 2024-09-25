package p166;
import java.util.Random;
import java.util.Scanner;
public class n10 {
	 public static void main(String[] args) {
	        int[][] array = new int[4][4]; // 4x4 크기의 2차원 배열 생성
	        Random random = new Random();
	        Scanner scanner = new Scanner(System.in);

	        // 0~255 범위의 랜덤 정수 생성 및 배열에 저장
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                array[i][j] = random.nextInt(256); // 0~255 범위의 정수
	            }
	        }

	        // 초기 배열 출력
	        System.out.println("초기 2차원 배열:");
	        printArray(array);

	        // 임계값 입력받기
	        System.out.print("임계값을 입력하세요: ");
	        int threshold = scanner.nextInt();

	        // 배열 수정
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                if (array[i][j] > threshold) {
	                    array[i][j] = 255; // 임계값보다 크면 255
	                } else {
	                    array[i][j] = 0; // 작거나 같으면 0
	                }
	            }
	        }

	        // 수정된 배열 출력
	        System.out.println("수정된 2차원 배열:");
	        printArray(array);

	        // 자원 해제
	        scanner.close();
	    }

	    // 배열 출력 메서드
	    private static void printArray(int[][] array) {
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(array[i][j] + "\t"); // 탭으로 구분하여 출력
	            }
	            System.out.println(); // 각 행의 끝에서 줄바꿈
	        }
	    }
	}
