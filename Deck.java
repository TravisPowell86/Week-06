package week06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Deck {

	//ArrayList for Deck
	private List<Card> cards = new ArrayList<Card>();
	
	private List<String> suits = Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades"); 
	private List<String> names = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
		
	//StringBuilder to name the cards
	private StringBuilder cardNames = new StringBuilder(); 
	
	public Deck() {
		
		//Adds 52 cards to the deck
		for (String suit : suits) {  
				int cardValue = 2;
				for (String name : names) { 
					cardNames.setLength(0); 
					cardNames.append(name + " of " + suit); 
					cards.add(new Card(cardNames.toString(), cardValue));
					cardValue++;
				}
		}  
		
	}
	
	//Shuffles deck
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	//Draws a card
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}

	//Gets the size of the list of Card
	public int getListSize() {
		return cards.size();
	}

}