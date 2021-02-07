/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.ice2_softdesign_2021;

/**
 *
 * @author aleks
 */
public class Card {
    
        private Suit suit;//here suit is a var
        private Value value;
        private Suit[] suitList; 
        private Value[] valueList; 
        
    public Card(){
    }
    
    public enum Suit {RED, YELLOW, GREEN, BLUE};
    
    public enum Value{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, 
                          SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD};
    
     //Start constructors here...
    
        
          //here Suit is a data type 
        //Constructor DI so compiler is happy
        public Card(Suit suit, Value value)
        {
           this.suit = suit;
           this.value= value;
         
        }
        
    
        //Extract values and add them field var list
        public void setSuitList(){
            //A:
            this.suitList = Suit.values();
            
        }
        
        //Make this var normal array of card values 
        public void setValueList(){
            //A: 
           this.valueList = Value.values();
       
        }
        
  
        //Return field var's value 
	public Value getValue() {
		return this.value;
	}
        
        
        //Return value of list 
        public Suit[] getSuitList(){
        return suitList;
        }
        
        //Return value of list
        public Value[] getValueList(){
            return valueList;
        }

        
	//Return value of field var 
	public Suit getSuit() {
		return this.suit;
        }
    
}//End class
