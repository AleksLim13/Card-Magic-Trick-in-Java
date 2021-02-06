package ca.sheridancollege.ice2_softdesign_2021;

import java.util.ArrayList;

/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author Aleks Lim @ Sheridan College 2021
 */
public class Card {
    
        //Field vars start here...
    
        //Call like Suit.RED or Suit.BLUE stands in for value
        //These values are final, of same data type, and a class in themselves. Wow!!
        //these are what we are setting with...
        public enum Suit {RED, YELLOW, GREEN, BLUE};
        
        //Call like Value.ZERO or Value.SKIP stands in for value
        public enum Value{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD};
        
        //Actual holder of these values 
        //This is what we're setting
        private final Suit suit;//here suit is a var
        private final Value value;
        private final ArrayList<Suit> suitList; 
        
        //Start constructors here ...
        
        //here Suit is a data type 
        //Constructor DI so compiler is happy
        public Card(Suit s, Value gVal, ArrayList<Suit> suitList)
        {
           suit = s;
           value= gVal;
           this.suitList = suitList;
        }
        
	public Value getValue() {
		return this.value;
	}
        
        
        //Bring it back now...
        public ArrayList<Suit> getSuitList(){
        return suitList;
        }

        //Extract values and add them field var list
        public void setSuitList(){
            //A: 
            Suit red = Suit.RED; 
            Suit yellow = Suit.YELLOW;
            Suit green = Suit.GREEN;
            Suit blue = Suit.BLUE;
            
            //B: 
            suitList.add(red);
            suitList.add(yellow);
            suitList.add(green);
            suitList.add(blue);
        }
	
	public Suit getSuit() {
		return this.suit;
        }
        
}