package p110c;

import java.util.Scanner;

public class p110c {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		final int TTEOK = 2000;
		final int GIM = 1000;
		final int JJOL = 3000;
		System.out.println("자바 분식입니다. 주문하면금액을 알려드립니다.");
		
		System.out.println("떡볶이 몇인분?");
		int tteok = scanner.nextInt();
		System.out.println("김말이 몇인분?");
		int gim = scanner.nextInt();
		System.out.println("쫄면 몇인분?");
		int jjol = scanner.nextInt();
		
		int totalprice = (tteok * TTEOK) + (gim * GIM) + (jjol * JJOL);
		
		System.out.println("전체금액은" + totalprice + "원입니다.");
}
}