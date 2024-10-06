package p245;

public class Rectangle {
	public static void main(String[] args) {
	    Rectangle a = new Rectangle(3, 3, 6, 6); // (3,3) 점에서 6x6 크기의 사각형
	    Rectangle b = new Rectangle(4, 4, 2, 3); // (4,4) 점에서 2x3 크기의 사각형

	    a.show();
	    if (a.isSquare()) System.out.println("a는 정사각형입니다.");
	    else System.out.println("a는 직사각형입니다.");

	    if (a.contains(b)) System.out.println("a는 b를 포함합니다.");
	}
}
