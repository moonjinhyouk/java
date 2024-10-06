package p245;

public class Average {
	class Average {
	    private int[] scores = new int[10]; // Array to store up to 10 scores
	    private int nextIndex = 0; // Tracks the current number of stored scores

	    // Method to add a score to the array
	    public void put(int score) {
	        if (nextIndex < 10) {
	            scores[nextIndex] = score;
	            nextIndex++;
	        } else {
	            System.out.println("Cannot store more than 10 scores.");
	        }
	    }

	    // Method to display all stored scores
	    public void showAll() {
	        System.out.print("***** 저장된 데이터 모두 출력 *****\n");
	        for (int i = 0; i < nextIndex; i++) {
	            System.out.print(scores[i] + " ");
	        }
	        System.out.println();
	    }

	    // Method to calculate and return the average of the stored scores
	    public double getAvg() {
	        if (nextIndex == 0) {
	            return 0.0; // No scores to calculate the average
	        }
	        int sum = 0;
	        for (int i = 0; i < nextIndex; i++) {
	            sum += scores[i];
	        }
	        return (double) sum / nextIndex;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Average avg = new Average(); // Create an Average object

	        // Store scores in the Average object
	        avg.put(10);  // Store score 10
	        avg.put(15);  // Store score 15
	        avg.put(100); // Store score 100

	        // Display all stored scores
	        avg.showAll();

	        // Print the average of the scores
	        System.out.println("평균은 " + avg.getAvg());
	    }
	}

}
