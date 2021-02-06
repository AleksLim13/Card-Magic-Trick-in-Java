package ca.sheridancollege.ice2_softdesign_2021;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author Aleks Lim @ Sheridan College 2021
 */
public class Card {
    
        public enum Suit {RED, YELLOW, GREEN, BLUE};
        public enum Value{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD};
        private final Suit suit;
        private final Value value;
        
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
}