package p166;
import java.util.Scanner;
public class n17 {
	 public static void main(String[] args) {
	        // 커피 메뉴와 가격 배열
	        String coffee[] = {"핫아메리카노", "아이스아메리카노", "카푸치노", "라떼"};
	        int price[] = {3000, 3500, 4000, 5000};

	        Scanner scanner = new Scanner(System.in);
	        int totalCost = 0;

	        System.out.println("커피 메뉴:");
	        for (int i = 0; i < coffee.length; i++) {
	            System.out.println((i + 1) + ". " + coffee[i] + " - " + price[i] + "원");
	        }

	        System.out.println("주문할 커피의 번호를 입력하세요. '그만'을 입력하면 주문을 종료합니다.");

	        while (true) {
	            System.out.print("주문: ");
	            String input = scanner.nextLine();

	            if (input.equals("그만")) {
	                break; // 주문 종료
	            }

	            try {
	                int coffeeNumber = Integer.parseInt(input);
	                if (coffeeNumber < 1 || coffeeNumber > coffee.length) {
	                    System.out.println("잘못된 번호입니다. 다시 시도하세요.");
	                } else {
	                    totalCost += price[coffeeNumber - 1]; // 가격 추가
	                    System.out.println(coffee[coffeeNumber - 1] + "가 주문되었습니다.");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("유효한 번호를 입력하세요.");
	            }
	        }

	        // 총 가격 출력
	        System.out.println("총 가격: " + totalCost + "원");
	        System.out.println("주문해 주셔서 감사합니다!");

	        // 자원 해제
	        scanner.close();
	    }
	}
