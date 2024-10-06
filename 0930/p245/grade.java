package p245;
import java.util.Scanner;
public class grade {
	class Grade {
	    private String name;
	    private int javaScore;
	    private int webScore;
	    private int osScore;

	    // Constructor
	    public Grade(String name, int java, int web, int os) {
	        this.name = name;
	        this.javaScore = java;
	        this.webScore = web;
	        this.osScore = os;
	    }

	    // Method to calculate the average
	    public double getAverage() {
	        return (javaScore + webScore + osScore) / 3.0;
	    }

	    // Getter for the name
	    public String getName() {
	        return name;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompting for user input
	        System.out.print("이름, 자바, 웹프로그래밍, 운영체제 순으로 점수 입력>>");
	        String name = scanner.next(); // Input name
	        int java = scanner.nextInt();  // Input Java score
	        int web = scanner.nextInt();   // Input Web Programming score
	        int os = scanner.nextInt();    // Input OS score

	        // Creating a Grade object
	        Grade st = new Grade(name, java, web, os);

	        // Printing the name and average score
	        System.out.println(st.getName() + "의 평균은 " + st.getAverage());

	        scanner.close();
	    }
	}

}
