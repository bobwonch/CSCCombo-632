
public class WarGame {

	public static void main(String[] args) {
	/////////////Setup////////////////////
		Deck deck = new Deck();
		
		deck.shuffle();
		
		Pile p1 = new Pile();
		Deck subDeck = deck.subDeck(0, 26);
		p1.addDeck(subDeck);
		
		Pile p2 = new Pile();
		subDeck = deck.subDeck(27, 52);
		p2.addDeck(subDeck);
		//System.out.println(p1);
		Pile midPile = new Pile();
		
		Pile winP1 = new Pile();
		
		Pile winP2 = new Pile();
	////////////////Logic////////////////////
		
		while(!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			midPile.addCard(c1);
			midPile.addCard(c2);
			
			int cmpResult = c1.compareTo(c2);
			
			if(cmpResult > 0) {
				System.out.println("P1 took the hand");
				winP1.addPile(midPile);
			}
			else if (cmpResult < 0) {
				System.out.println("P2 took the hand");
				winP2.addPile(midPile);
			}
			else {
				System.out.println("Tie hand");
			}
		}
		
		///////////cards are spent///////////////
		if(winP1.size() > winP2.size()) {
			System.out.println("Player 1 wins!");
		}
		else if(winP1.size() < winP2.size()) {
			System.out.println("Player 2 wins!");
		}
		else{
			System.out.println("Tie!");
		}
		
		
		
	}
}
