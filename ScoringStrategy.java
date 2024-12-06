package ca.sheridancollege.project;

/**
 * Strategy Pattern interface for scoring.
 */
public interface ScoringStrategy {
    int calculateScore(int playerCardValue, int opponentCardValue);
}
