package p166;
import java.util.Scanner;
public class n12 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("성별을 입력하세요 (남/여). '그만'을 입력하면 종료됩니다.");

	        while (true) {
	            System.out.print("입력: ");
	            String input = scanner.nextLine();

	            if (input.equals("그만")) {
	                System.out.println("프로그램을 종료합니다.");
	                break; // 프로그램 종료
	            }

	            switch (input) {
	                case "남":
	                    String maleName = generateMaleName();
	                    System.out.println("추천 남자 이름: " + maleName);
	                    break;
	                case "여":
	                    String femaleName = generateFemaleName();
	                    System.out.println("추천 여자 이름: " + femaleName);
	                    break;
	                default:
	                    System.out.println("잘못된 입력입니다. '남' 또는 '여'를 입력하세요.");
	                    break;
	            }
	        }

	        // 자원 해제
	        scanner.close();
	    }

	    // 남자 이름 생성 메서드
	    private static String generateMaleName() {
	        String[] maleNames = {"민준", "서준", "예준", "도현", "하준"};
	        int randomIndex = (int) (Math.random() * maleNames.length);
	        return maleNames[randomIndex];
	    }

	    // 여자 이름 생성 메서드
	    private static String generateFemaleName() {
	        String[] femaleNames = {"서연", "지우", "하린", "지민", "수빈"};
	        int randomIndex = (int) (Math.random() * femaleNames.length);
	        return femaleNames[randomIndex];
	    }
	}
