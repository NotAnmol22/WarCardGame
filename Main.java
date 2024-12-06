package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * Entry point for the War card game.
 */
public class Main {
    public static void main(String[] args) {
        War game = new War(new DefaultScoringStrategy());
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Player 1 name: ");
        String player1Name = scanner.nextLine();
        game.addPlayer(new WarPlayer(player1Name));

        System.out.print("Enter Player 2 name: ");
        String player2Name = scanner.nextLine();
        game.addPlayer(new WarPlayer(player2Name));

        game.play();
        scanner.close();
    }
}
