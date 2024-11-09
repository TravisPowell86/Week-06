package week06;

import java.util.List;
import java.util.ArrayList;

public class Player {
	
	//Represents the cards each player has in their hand after the cards are dealt
	List<Card> hand = new ArrayList<Card>();
	String playerName;
	int score;
	
	//Initializes player's name and score
	public Player(String playerName) {
		this.playerName = playerName; 
		this.score = 0; 
	}
	
	//Cards in player's hands
	public void describe() {
		System.out.println(this.playerName + "'s Cards:" );
		for (Card card : this.hand) {
			card.describe();
		}
	}
	
	//Flips a card from player's hand
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;	
	}
	
	//Draws a card from the deck and adds it to their hand
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//Increments winner's score by 1 point
	public int incrementScore() {
		return score += 1;
	}
	
	//Gets a player's score
	public int getScore() {
		return this.score;
	}
	
	//Gets the number of cards in a player's hand
	public int getCardsInHandSize() {
		return hand.size();
	}
	
}