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
}
