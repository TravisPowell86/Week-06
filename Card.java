package week06;

public class Card {

	private String cardName;
	private int cardValue;
	
	//Card's names and values
	public Card(String cardName, int cardValue) { 
		this.cardName = cardName;
		this.cardValue = cardValue;	
	}
	
	//Prints a card's name and value scored 
	public void describe() {
		System.out.print(cardName + ", " + cardValue + " points!");
	}

	//Gets the card's name
	public String getName() {
		return cardName;
	}

	//Sets the card's name 
	public void setName(String name) {
		this.cardName = name;
	}

	//Gets the card's value
	public int getValue() {
		return cardValue;
	}

	//Sets the card's value
	public void setValue(int value) {
		this.cardValue = value;
	}
	
	
}