package p166;
import java.util.Scanner;
public class n13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 과목명 배열
        String course[] = {"C", "C++", "Python", "Java", "HTML5"};
        // 학점 배열
        String grade[] = {"A", "B+", "B", "A+", "D"};

        System.out.println("과목명을 입력하세요. '그만'을 입력하면 프로그램이 종료됩니다.");

        while (true) {
            System.out.print("입력: ");
            String input = scanner.nextLine();

            if (input.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break; // 프로그램 종료
            }

            // 과목명을 찾고 학점 출력
            int index = -1;
            for (int i = 0; i < course.length; i++) {
                if (course[i].equalsIgnoreCase(input)) {
                    index = i;
                    break;
                }
            }

            // 결과 출력
            if (index != -1) {
                System.out.println(input + "의 학점: " + grade[index]);
            } else {
                System.out.println("잘못된 과목명입니다.");
            }
        }

        // 자원 해제
        scanner.close();
    }
}
