package p245;

public class MonthDiary {
	class DayDiary {
	    String memo;

	    public DayDiary() {
	        memo = ""; // 일기의 기본 내용은 비어있음
	    }

	    public void write(String text) {
	        memo = text; // 일기 쓰기
	    }

	    public void show() {
	        System.out.println(memo); // 일기 보여주기
	    }
	}

	class MonthDiary {
	    DayDiary[] days; // 30개의 일기를 저장할 배열
	    int year, month;

	    public MonthDiary(int year, int month) {
	        this.year = year;
	        this.month = month;
	        days = new DayDiary[30]; // 30일짜리 일기 배열 생성
	        for (int i = 0; i < days.length; i++) {
	            days[i] = new DayDiary(); // 각각의 DayDiary 객체 생성
	        }
	    }

	    public void run() {
	        // 여기에서 메인 기능을 실행
	        System.out.println(year + "년 " + month + "월의 다이어리입니다.");
	        getMenu(); // 메뉴 보여주기
	    }

	    public void write(int day, String text) {
	        if (day >= 1 && day <= 30) {
	            days[day - 1].write(text); // 해당 일에 일기 쓰기
	        } else {
	            System.out.println("유효하지 않은 날짜입니다.");
	        }
	    }

	    public void show(int day) {
	        if (day >= 1 && day <= 30) {
	            days[day - 1].show(); // 해당 일의 일기 보여주기
	        } else {
	            System.out.println("유효하지 않은 날짜입니다.");
	        }
	    }

	    public void getMenu() {
	        // 간단한 메뉴를 보여주는 코드
	        System.out.println("메뉴: 1. 기록, 2. 보기, 3. 종료");
	    }
	   
	    public static void main(String[] args) {
	        MonthDiary monthDiary = new MonthDiary(2024, 10); // 2024년 10월 다이어리
	        monthDiary.run();
	    }
}
}
