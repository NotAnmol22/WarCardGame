package ca.sheridancollege.project;

/**
 * Represents the War card game.
 * Implements the Strategy Pattern for scoring logic.
 */
public class War extends Game {
    private GroupOfCards deck;
    private int player1Score = 0;
    private int player2Score = 0;
    private final int maxRounds = 4;
    private ScoringStrategy scoringStrategy;

    public War(ScoringStrategy scoringStrategy) {
        super("War");
        this.scoringStrategy = scoringStrategy;
        this.deck = new GroupOfCards();
        initializeDeck();
        deck.shuffle();
    }

    private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits) {
            for (int value = 1; value <= 13; value++) {
                deck.addCard(CardFactory.createCard(suit, value));
            }
        }
    }

    @Override
    public void play() {
        System.out.println("Starting the War game with " + maxRounds + " rounds!");

        for (int round = 1; round <= maxRounds; round++) {
            System.out.println("\nRound " + round);

            if (deck.size() < 2) {
                System.out.println("Not enough cards to continue.");
                break;
            }

            PlayingCard player1Card = (PlayingCard) deck.drawCard();
            PlayingCard player2Card = (PlayingCard) deck.drawCard();

            System.out.println(getPlayers().get(0).getName() + " drew: " + player1Card);
            System.out.println(getPlayers().get(1).getName() + " drew: " + player2Card);

            compareCards(player1Card, player2Card);
        }

        declareWinner();
    }

    private void compareCards(PlayingCard player1Card, PlayingCard player2Card) {
        int scoreChange = scoringStrategy.calculateScore(player1Card.getValue(), player2Card.getValue());
        if (scoreChange > 0) {
            player1Score++;
            System.out.println(getPlayers().get(0).getName() + " wins this round!");
        } else if (scoreChange < 0) {
            player2Score++;
            System.out.println(getPlayers().get(1).getName() + " wins this round!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    @Override
    public void declareWinner() {
        System.out.println("\nGame Over!");
        System.out.println("Final Score:");
        System.out.println(getPlayers().get(0).getName() + ": " + player1Score);
        System.out.println(getPlayers().get(1).getName() + ": " + player2Score);

        if (player1Score > player2Score) {
            System.out.println(getPlayers().get(0).getName() + " wins the game!");
        } else if (player1Score < player2Score) {
            System.out.println(getPlayers().get(1).getName() + " wins the game!");
        } else {
            System.out.println("The game ends in a tie!");
        }
    }
}
