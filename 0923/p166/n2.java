package p166;

public class n2 {
	public static void main(String [] args) {
		int n[] = {1,-2,6,20,5,72,-16,256};
		for(int i=0; i<n.length; i++) {
			if(n[i] > 0 && n[i] %4 == 0) {
				System.out.print(n[i] + "");
			}
		}
	}
}

public class n2 {
    public static void main(String[] args) {
        int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
        int i = 0;

        // 양수이면서 4의 배수인 숫자를 출력
        while (i < n.length) {
            if (n[i] > 0 && n[i] % 4 == 0) {
                System.out.print(n[i] + " ");
            }
            i++;
        }
    }
}

public class n2 {
    public static void main(String[] args) {
        int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
        int i = 0;

        // 양수이면서 4의 배수인 숫자를 출력
        do {
            if (n[i] > 0 && n[i] % 4 == 0) {
                System.out.print(n[i] + " ");
            }
            i++;
        } while (i < n.length);
    }
}