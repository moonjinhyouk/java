package p110d;

import java.util.Scanner;

public class p110d {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	       
	        // 입력 받기
	        System.out.println("여행지: 태국 치앙마이");
	        System.out.println("인원 수를 입력하세요: ");
	        int numPeople = scanner.nextInt();
	       
	        System.out.println("숙박일을 입력하세요: ");
	        int numNights = scanner.nextInt();
	       
	        System.out.println("1인당 항공료를 입력하세요: ");
	        int flightCostPerPerson = scanner.nextInt();
	       
	        System.out.println("1방 숙박비를 입력하세요: ");
	        int roomCostPerNight = scanner.nextInt();
	       
	        System.out.println("필요한 방의 개수를 입력하세요: ");
	        int numRooms = scanner.nextInt();
	       
	        // 계산
	        int totalFlightCost = numPeople * flightCostPerPerson;
	        int totalAccommodationCost = numNights * roomCostPerNight * numRooms;
	        int totalCost = totalFlightCost + totalAccommodationCost;
	       
	        // 결과 출력
	        System.out.println(numPeople + "명의 태국 치앙마이 " + numNights + "박" + (numNights+1) + "일 여행에는 방이 "
	                           + numRooms + "개 필요하며 경비는 " + totalCost + "원입니다.");
	       
	        scanner.close();
}
}