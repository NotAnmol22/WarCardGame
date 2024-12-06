package ca.sheridancollege.project;

/**
 * The ScoringStrategy interface defines the scoring logic for the War card game.
 * 
 * **Design Patterns**:
 * - **Strategy Pattern**: Allows dynamic selection of scoring logic by defining an interface and concrete implementations (e.g., DefaultScoringStrategy).
 * 
 * **Object-Oriented Principles**:
 * - **Open/Closed Principle (OCP)**: New scoring strategies can be added as separate implementations without altering existing code.
 * 
 * Methods:
 * - `calculateScore(int playerCardValue, int opponentCardValue)`: Calculates the score based on card values.
 */
public interface ScoringStrategy {
    int calculateScore(int playerCardValue, int opponentCardValue);
}
