package p166;

public class n4 {
	public static void main(String[] args) {
        int n[][] = {
            {1, 2, 3},
            {1, 2},
            {1},
            {1, 2, 3},
            {1, 2, 3, 4}
        };

        // 2차원 배열 출력
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println(); // 각 행의 끝에서 줄바꿈
        }
    }
}

