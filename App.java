package week06;

public class App {

	public static void main(String[] args) {
		
		//Instantiates a deck
		Deck deck = new Deck();

		//Instantiates two players
		Player player1 = new Player("Mario");
		Player player2 = new Player("Luigi");

		Card cardPlayer1;
		Card cardPlayer2;
		
		int deckSize = deck.getListSize();		
		int handSize;
		
		//Shuffles deck
		deck.shuffle();
				
		//Draws the 52 cards in the deck to be split amongst each player
		for (int drawFromDeck = 0; drawFromDeck < deckSize; drawFromDeck++) {
			if (drawFromDeck % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		System.out.println("***** THIS IS WAR!!! *****");
		
		//26 Cards to each player's hand
		handSize = player1.getCardsInHandSize();
		
		//Players flip cards to battle 26 separate times
		for (int turn = 0; turn < handSize; turn++) {
			cardPlayer1 = player1.flip();
			cardPlayer2 = player2.flip();

			System.out.println("\n* CARDS FLIPPED BY EACH PLAYER: *");
			System.out.print(player1.playerName + "'s Card: ");
			cardPlayer1.describe();    //Shows the cardName and cardValue of player 1's card
			System.out.print("\n" + player2.playerName + "'s Card: ");
			cardPlayer2.describe();    //Shows the cardName and cardValue of player 2's card

			//Compares each player's card. Player with higher value card gets 1 point
			if (cardPlayer1.getValue() > cardPlayer2.getValue()) {
				player1.incrementScore();
				System.out.println("\n" + player1.playerName + " wins this round!\n");
			} else if (cardPlayer2.getValue() > cardPlayer1.getValue()) {
				player2.incrementScore();
				System.out.println("\n" + player2.playerName + " wins this round!\n");
			} else {
				System.out.println("\n\nIt was a tie this round! \n(No points scored.)\n");
			}

			//Prints the score after each turn
			System.out.println("*** CURRENT SCORES: ***");
			System.out.printf(player1.playerName + "'s Score - %d\n" + player2.playerName + "'s Score - %d %n", player1.getScore(), player2.getScore());
		}

		
		//Prints the final scores at the end
		System.out.println("\n\n***** FINAL SCORES: *****");
		System.out.printf(player1.playerName + "'s Score - %d\n" + player2.playerName + "'s Score - %d %n%n", player1.getScore(), player2.getScore());

		
		//Compares the final scores and prints the winner
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.playerName + " is the winner! \nYahoo!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.playerName + " is the winner! \nWeehee!");
		} else { 
			System.out.println("It's a Draw! \nBoohoo...");  //If there is a tie
		}
		
	}
}