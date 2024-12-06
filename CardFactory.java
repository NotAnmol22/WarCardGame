package ca.sheridancollege.project;

/**
 * Factory class for creating card objects.
 */
public class CardFactory {
    public static Card createCard(String suit, int value) {
        return new PlayingCard(suit, value);
    }
}
