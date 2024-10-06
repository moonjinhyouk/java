package p245;

public class VArray {
	class VArray {
	    private int[] arr;
	    private int count; // 현재 저장된 원소 개수

	    public VArray(int size) {
	        arr = new int[size];
	        count = 0;
	    }

	    // 배열 크기 두 배로 늘리기
	    private void resize() {
	        int[] newArr = new int[arr.length * 2];
	        for (int i = 0; i < arr.length; i++) {
	            newArr[i] = arr[i];
	        }
	        arr = newArr;
	    }

	    // 배열의 마지막에 원소 추가
	    public void add(int value) {
	        if (count >= arr.length) {
	            resize();
	        }
	        arr[count++] = value;
	    }

	    // 특정 위치에 원소 삽입
	    public void insert(int index, int value) {
	        if (index < 0 || index > count) {
	            System.out.println("잘못된 인덱스입니다.");
	            return;
	        }
	        if (count >= arr.length) {
	            resize();
	        }
	        for (int i = count; i > index; i--) {
	            arr[i] = arr[i - 1];
	        }
	        arr[index] = value;
	        count++;
	    }

	    // 배열 내용 출력
	    public void print() {
	        for (int i = 0; i < count; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	}

	public class VArrayEx {
	    public static void main(String[] args) {
	        VArray varray = new VArray(5); // 초기 크기 5인 배열 생성

	        // 원소 추가
	        varray.add(10);
	        varray.add(20);
	        varray.add(30);
	        varray.add(40);
	        varray.add(50);
	        varray.print();

	        // 크기를 넘어서는 원소 추가 (자동 크기 증가)
	        varray.add(60);
	        varray.print();

	        // 특정 위치에 원소 삽입
	        varray.insert(2, 25);
	        varray.print();

	        // 유효하지 않은 위치에 원소 삽입 시도
	        varray.insert(10, 70); // 잘못된 인덱스입니다.
	    }
	}
}
