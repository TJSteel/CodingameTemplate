package game;

import java.util.Scanner;

/**
 * The main class for your game
 * 
 * @author Jay
 *
 */
public class Player {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		// game loop
		while (true) {
			// an integer
			int I = in.nextInt();
			System.out.println(I);
		}
	}
}