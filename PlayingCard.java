package ca.sheridancollege.project;

/**
 * A concrete implementation of a card, representing a standard playing card.
 */
public class PlayingCard extends Card {
    private String suit;
    private int value;

    public PlayingCard(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        return ranks[value - 1] + " of " + suit;
    }

    public int getValue() {
        return value;
    }
}
