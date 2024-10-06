package p245;

public class ArrayUtil {
	class ArrayUtil {
	    // 두 배열을 연결하여 새로운 배열을 반환
	    public static int[] concat(int[] a, int[] b) {
	        int[] result = new int[a.length + b.length];  // 두 배열 크기의 결과 배열 생성
	        System.arraycopy(a, 0, result, 0, a.length);  // 배열 a 복사
	        System.arraycopy(b, 0, result, a.length, b.length);  // 배열 b 복사
	        return result;
	    }

	    // 배열 출력
	    public static void print(int[] a) {
	        System.out.print("[ ");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println("]");
	    }
	}

	public class StaticEX {
	    public static void main(String[] args) {
	        int[] array1 = {1, 5, 7, 9};
	        int[] array2 = {3, 6, -1, 100, 77};
	        int[] array3 = ArrayUtil.concat(array1, array2);  // 배열 합치기
	        ArrayUtil.print(array3);  // 결과 배열 출력
	    }
	}
}
