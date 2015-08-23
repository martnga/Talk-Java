//  SUITS
//Spades = 3
//Hearts = 2  
//Diamonds = 1
//Clubs = 0
//======================
//   RANKS
//Jack = 11
//Queen → 12
//King = 13


public class Card {
 int suit, rank;
 
 public Card() {
	this.suit = 0;
	this.rank = 0;
 }
	  
 public Card(int suit, int rank) {
	this.suit = suit; this.rank = rank;
 }
 
 public static void printCard(Card c) {
	 String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	 String[] ranks = { "nunu", "Ace", "2", "3", "4", "5", "6",
	 "7", "8", "9", "10", "Jack", "Queen", "King" };
	 System.out.println(ranks[c.rank] + " of " + suits[c.suit]);
	 }
 
 public static boolean sameCard(Card c1, Card c2) {
	 return(c1.suit == c2.suit && c1.rank == c2.rank);
	 }
 
 public static void printDeck(Card[] cards) {
	 for (int i = 0; i < cards.length; i++) {
	 printCard(cards[i]);
	 }
   }
 
 public static int findCard(Card[] cards, Card card) {
	 for (int i = 0; i< cards.length; i++) {
		 if (sameCard(cards[i], card)) {
			 return i;
		 }
	  }
	return -1;
  }
	 
}
