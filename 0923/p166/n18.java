package p166;
import java.util.Scanner;
public class n18 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int[] studentIds = new int[10]; // 학생 학번 저장 배열
	        int[] scores = new int[10]; // 학생 점수 저장 배열

	        // 학번과 점수 입력 받기
	        for (int i = 0; i < 10; i++) {
	            System.out.print("학생 " + (i + 1) + "의 학번을 입력하세요: ");
	            studentIds[i] = scanner.nextInt();
	            System.out.print("학생 " + (i + 1) + "의 점수를 입력하세요: ");
	            scores[i] = scanner.nextInt();
	        }

	        // 학번 입력받아 점수 출력
	        System.out.print("학번을 입력하세요 (종료하려면 -1 입력): ");
	        while (true) {
	            int inputId = scanner.nextInt();
	            if (inputId == -1) {
	                break; // 종료
	            }

	            boolean found = false; // 학번 찾기 여부
	            for (int i = 0; i < studentIds.length; i++) {
	                if (studentIds[i] == inputId) {
	                    System.out.println("학번 " + inputId + "의 점수: " + scores[i]);
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
	            }
	        }

	        // 자원 해제
	        scanner.close();
	    }
	}