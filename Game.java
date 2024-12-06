package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * Abstract class representing a generic game.
 * Defines the basic structure and rules for any card game.
 */
public abstract class Game {
    private String name;
    private ArrayList<Player> players;

    public Game(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public abstract void play();

    public abstract void declareWinner();
}
