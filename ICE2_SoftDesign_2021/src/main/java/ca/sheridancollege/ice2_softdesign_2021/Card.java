/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.ice2_softdesign_2021;

/**
 *
 * @author Aleks Lim @ Sheridan College 2021
 */

//Encapsulation lets us just change our class in one place instead of many. 
//Creating this class card has encapsulated all stuff related to a card in
//real life like suit and value. We can reuse this class 60 times in creating
//our Uno deck and we only have to code one of these. We link this functionality
//to a var name of this data type and boom, we can just use it's functionality. 

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
        
        //Return field var's value 
	public Value getValue() {
		return this.value;
	}
    
}//End class
