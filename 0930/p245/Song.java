package p245;

public class Song {
	class Song {
	    private String title;  // 노래 제목
	    private String singer; // 가수 이름
	    private int year;      // 발표 연도
	    private String country; // 국가

	    // 생성자: 노래의 세부 정보를 초기화합니다.
	    public Song(String title, String singer, int year, String country) {
	        this.title = title;
	        this.singer = singer;
	        this.year = year;
	        this.country = country;
	    }

	    // 노래 정보를 출력하는 메서드
	    public void show() {
	        System.out.println(year + "년 " + country + "의 " + singer + "가 부른 " + title);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // 주어진 세부 정보로 Song 객체를 생성
	        Song mySong = new Song("가로수 그늘 아래 서면", "이문세", 1988, "한국");

	        // show 메서드를 호출하여 노래 정보를 출력
	        mySong.show();
	    }
	}

}
