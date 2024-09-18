package p110;

import java.util.Scanner;

public class p110 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int EXCHANGE_RATE = 1200;
		
		System.out.println("1$는 1200원입니다.");
		
		System.out.print("달러를 입력하세요:");
		int dollars = scanner.nextInt();
		
		int won = dollars*EXCHANGE_RATE;
		
		System.out.println(dollars+"$는"+won+"원입니다.");
		
	}
}
