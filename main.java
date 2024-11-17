package ca.sheridancollege.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new War game instance
        War game = new War();
        Scanner scanner = new Scanner(System.in);

        // Register players
        System.out.print("Enter Player 1 name: ");
        String player1Name = scanner.nextLine();
        game.addPlayer(new WarPlayer(player1Name));

        System.out.print("Enter Player 2 name: ");
        String player2Name = scanner.nextLine();
        game.addPlayer(new WarPlayer(player2Name));

        // Start the game
        game.play();

        // Close the scanner
        scanner.close();
    }
}
