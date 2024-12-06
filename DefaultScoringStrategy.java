package ca.sheridancollege.project;

/**
 * Default scoring logic for War card game.
 */
public class DefaultScoringStrategy implements ScoringStrategy {
    @Override
    public int calculateScore(int playerCardValue, int opponentCardValue) {
        if (playerCardValue > opponentCardValue) {
            return 1;
        } else if (playerCardValue < playerCardValue) {
            return -1;
        }
        return 0;
    }
}
