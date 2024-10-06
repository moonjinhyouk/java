package p245;
import java.util.Random;
import java.util.Scanner;
public class Player {
	
	    String name;
	    int score = 0;

	    public Player(String name) {
	        this.name = name;
	    }
	

	public class GuessGame {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        // Players setup
	        System.out.println("*** 예측 게임을 시작합니다. ***");
	        System.out.print("게임에 참여할 선수 수 >>> ");
	        int numberOfPlayers = scanner.nextInt();
	        scanner.nextLine();  // Consume newline left-over
	       
	        Player[] players = new Player[numberOfPlayers];
	        for (int i = 0; i < numberOfPlayers; i++) {
	            System.out.print("선수 이름 >>> ");
	            String name = scanner.nextLine();
	            players[i] = new Player(name);
	        }

	        String playAgain;
	        do {
	            int targetNumber = random.nextInt(100) + 1;
	            System.out.println("1~100 사이의 숫자가 결정되었습니다. 선수들은 맞추어 보세요.");

	            int closestGuess = 0;
	            Player closestPlayer = null;

	            for (Player player : players) {
	                System.out.print(player.name + "의 추측 >>> ");
	                int guess = scanner.nextInt();

	                if (closestPlayer == null || Math.abs(targetNumber - guess) < Math.abs(targetNumber - closestGuess)) {
	                    closestGuess = guess;
	                    closestPlayer = player;
	                }
	            }

	            System.out.println("정답은: " + targetNumber);
	            System.out.println(closestPlayer.name + "이 이겼습니다! 승점 1점 획득!");
	            closestPlayer.score++;

	            System.out.print("게임을 다시 하시겠습니까? (yes/no) >>> ");
	            scanner.nextLine(); // consume newline
	            playAgain = scanner.nextLine();
	        } while (playAgain.equalsIgnoreCase("yes"));

	        System.out.println("최종 결과:");
	        for (Player player : players) {
	            System.out.println(player.name + ": " + player.score + "점");
	        }

	        scanner.close();
	    }
	}
}