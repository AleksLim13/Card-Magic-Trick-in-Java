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
        public enum Value{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, 
                          SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD};
        
        //Actual holder of these values 
        //This is what we're setting
        private final Suit suit;//here suit is a var
        private final Value value;
        private Suit[] suitList; 
        private Value[] valueList; 
        
        //Start constructors here ...
        
        //here Suit is a data type 
        //Constructor DI so compiler is happy
        public Card(Suit s, Value gVal)
        {
           this.suit = s;
           this.value= gVal;
 
        }
        
	public Value getValue() {
		return this.value;
	}
        
        
        //Bring it back now...
        public Suit[] getSuitList(){
        return suitList;
        }
        
        public Value[] getValueList(){
            return valueList;
        }

        //Extract values and add them field var list
        public void setSuitList(){
            //A: 
            this.suitList = Suit.values();
            
        }
        
        public void setValueList(){
            
            //Some rendundancies. Hmmm....
            //We need to for loop this up. 

           this.valueList = Value.values();
       
        }
	
	public Suit getSuit() {
		return this.suit;
        }
        
}