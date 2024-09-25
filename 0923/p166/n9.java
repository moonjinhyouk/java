package p166;
import java.util.Random;
public class n9 {
	public static void main(String[] args) {
        int[][] array = new int[4][4]; // 4x4 크기의 2차원 배열 생성
        Random random = new Random();

        // 0~255 범위의 랜덤 정수 생성 및 배열에 저장
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(256); // 0~255 범위의 정수
            }
        }

        // 배열 출력
        System.out.println("2차원 배열:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + "\t"); // 탭으로 구분하여 출력
            }
            System.out.println(); // 각 행의 끝에서 줄바꿈
        }
    }
}
