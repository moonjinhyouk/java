package p166;

public class n1 {
	public static void main(String [] args) {
 int sum =0, i=1;
 while (true) {
	 if(i>50)
		 break;
	 sum = sum +i;
	 i+=3;
	 System.out.println(sum);
 }
	}
	
}

public class n1 {
	 public static void main(String[] args) {
	        int sum = 0;

	        for (int i = 1; i <= 50; i += 3) {
	            sum += i;
	            System.out.println(sum);
	        }
	    }
	}


public class n1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        do {
            if (i > 50) {
                break;
            }
            sum += i;
            System.out.println(sum);
            i += 3;
        } while (true);
    }
}