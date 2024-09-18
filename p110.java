package p110;

import java.util.Scanner;

public class p110 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
	
		
		
		System.out.print("태어난 년도를 입력하세요:");
		int year = scanner.nextInt();
		System.out.print("태어난 월를 입력하세요:");
		int month = scanner.nextInt();
		System.out.print("태어난 일를 입력하세요:");
		int day = scanner.nextInt();
		
		System.out.print("생일은"+year+"년"+month+"월"+day+"일");
		
	}
}
