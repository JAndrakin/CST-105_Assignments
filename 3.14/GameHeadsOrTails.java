import java.util.Scanner;

public class GameHeadsOrTails {
// 3.14 game heads or tails
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please guess, 0 for head, and 1 for tail:");
		int i = input.nextInt();
		int j = (int) (Math.random() * 2);
		
		if (i == j) {
			System.out.print("You won!!");
		} else {
			System.out.print("You lose!!");
		}
	}
}
