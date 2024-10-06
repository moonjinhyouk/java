package p245;
import java.util.Scanner;

public class seat {
	class Seat {
	    private String[] seats;

	    public Seat() {
	        seats = new String[10]; // 좌석 10개
	        for (int i = 0; i < seats.length; i++) {
	            seats[i] = "---"; // 초기 좌석은 모두 빈 상태
	        }
	    }

	    public void show() {
	        for (int i = 0; i < seats.length; i++) {
	            System.out.print(seats[i] + " ");
	        }
	        System.out.println();
	    }

	    public boolean reserve(String name, int seatNumber) {
	        if (seatNumber < 1 || seatNumber > 10 || !seats[seatNumber - 1].equals("---")) {
	            return false;
	        }
	        seats[seatNumber - 1] = name;
	        return true;
	    }

	    public boolean cancel(String name) {
	        for (int i = 0; i < seats.length; i++) {
	            if (seats[i].equals(name)) {
	                seats[i] = "---";
	                return true;
	            }
	        }
	        return false;
	    }
	}

	class ConcertReservation {
	    private Seat s;
	    private Seat a;
	    private Seat b;

	    public ConcertReservation() {
	        s = new Seat();
	        a = new Seat();
	        b = new Seat();
	    }

	    public void reserveSeat(String type, String name, int seatNumber) {
	        boolean success = false;
	        switch (type) {
	            case "S":
	                success = s.reserve(name, seatNumber);
	                break;
	            case "A":
	                success = a.reserve(name, seatNumber);
	                break;
	            case "B":
	                success = b.reserve(name, seatNumber);
	                break;
	            default:
	                System.out.println("잘못된 좌석 타입입니다.");
	                return;
	        }

	        if (success) {
	            System.out.println("예약되었습니다.");
	        } else {
	            System.out.println("예약에 실패했습니다. 좌석 번호를 확인하세요.");
	        }
	    }

	    public void showSeats() {
	        System.out.print("S>> ");
	        s.show();
	        System.out.print("A>> ");
	        a.show();
	        System.out.print("B>> ");
	        b.show();
	    }

	    public void cancelReservation(String type, String name) {
	        boolean success = false;
	        switch (type) {
	            case "S":
	                success = s.cancel(name);
	                break;
	            case "A":
	                success = a.cancel(name);
	                break;
	            case "B":
	                success = b.cancel(name);
	                break;
	            default:
	                System.out.println("잘못된 좌석 타입입니다.");
	                return;
	        }

	        if (success) {
	            System.out.println("취소되었습니다.");
	        } else {
	            System.out.println("예약자를 찾을 수 없습니다.");
	        }
	    }
	}

	public class ReservationSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ConcertReservation concert = new ConcertReservation();

	        System.out.println("콘서트 예약 시스템입니다.");
	        while (true) {
	            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
	            int choice = scanner.nextInt();

	            if (choice == 4) {
	                System.out.println("프로그램을 종료합니다.");
	                break;
	            }

	            switch (choice) {
	                case 1: // 예약
	                    System.out.print("좌석구분 S(1), A(2), B(3) >> ");
	                    String type = scanner.next();
	                    System.out.print("이름 >> ");
	                    String name = scanner.next();
	                    System.out.print("좌석번호 >> ");
	                    int seatNumber = scanner.nextInt();
	                    concert.reserveSeat(type, name, seatNumber);
	                    break;

	                case 2: // 조회
	                    concert.showSeats();
	                    break;

	                case 3: // 취소
	                    System.out.print("좌석구분 S(1), A(2), B(3) >> ");
	                    type = scanner.next();
	                    System.out.print("이름 >> ");
	                    name = scanner.next();
	                    concert.cancelReservation(type, name);
	                    break;

	                default:
	                    System.out.println("잘못된 입력입니다.");
	                    break;
	            }
	        }

	        scanner.close();
	    }
	}

}
