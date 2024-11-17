package ca.sheridancollege.project;

public class War extends Game {
    private GroupOfCards deck;
    private int player1Score;
    private int player2Score;
    private final int maxRounds = 4;  // Set maximum number of rounds

    public War() {
        super("War");
        deck = new GroupOfCards();
        initializeDeck();
        deck.shuffle();
    }

    // Initializes a standard deck of 52 cards
    private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits) {
            for (int value = 1; value <= 13; value++) {
                deck.addCard(new PlayingCard(suit, value));
            }
        }
    }

    @Override
    public void play() {
        System.out.println("Starting the War game with " + maxRounds + " rounds!");

        for (int round = 1; round <= maxRounds; round++) {
            System.out.println("\nRound " + round);

            // Ensure there are enough cards for each player to draw
            if (deck.size() < 2) {
                System.out.println("Not enough cards to continue. Ending game.");
                break;
            }

            // Each player draws a card
            PlayingCard player1Card = (PlayingCard) deck.drawCard();
            PlayingCard player2Card = (PlayingCard) deck.drawCard();

            System.out.println(getPlayers().get(0).getName() + " drew: " + player1Card);
            System.out.println(getPlayers().get(1).getName() + " drew: " + player2Card);

            // Compare cards and update scores
            if (player1Card.getValue() > player2Card.getValue()) {
                System.out.println(getPlayers().get(0).getName() + " wins this round!");
                player1Score++;
            } else if (player1Card.getValue() < player2Card.getValue()) {
                System.out.println(getPlayers().get(1).getName() + " wins this round!");
                player2Score++;
            } else {
                System.out.println("It's a tie!");
            }
        }

        // After all rounds are completed, declare the final winner
        declareWinner();
    }

    @Override
    public void declareWinner() {
        System.out.println("\nGame Over!");
        System.out.println("Final Score:");
        System.out.println(getPlayers().get(0).getName() + ": " + player1Score);
        System.out.println(getPlayers().get(1).getName() + ": " + player2Score);

        // Determine the winner based on final scores
        if (player1Score > player2Score) {
            System.out.println(getPlayers().get(0).getName() + " is the overall winner!");
        } else if (player1Score < player2Score) {
            System.out.println(getPlayers().get(1).getName() + " is the overall winner!");
        } else {
            System.out.println("The game ends in a tie!");
        }
    }
}
