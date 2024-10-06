package p245;

public class Memo {
	public static void main(String[] args) {
		Memo a = new Memo("유송연", "10:10", "자바과제있음");
		Memo b = new Memo("박채원", "10:15", "시카고로 어학연수가요");
		Memo c = new Memo("김경미", "11:30", "사랑하는사람이 생겼어요");
		
		a.show();
		if(a.isSamName(b) System.out.prntln("동일한 사람입니다"));
		else System.out.println("다른 사람입니다.");
		System.out.println(c.getName() + "가 작성한 메모의 길이는 " + c.length());
	}
}
