package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {
    private ArrayList<Card> cards; 

    public GroupOfCards() {
        cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void shuffle() {
        Collections.shuffle(cards); 
    }

    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0); 
        }
        return null;
    }

    public int size() {
        return cards.size(); 
    }
}
