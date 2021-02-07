/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.ice2_softdesign_2021;

import ca.sheridancollege.ice2_softdesign_2021.Card.Suit;
import ca.sheridancollege.ice2_softdesign_2021.Card.Value;
import java.util.ArrayList;

/**
 *
 * @author Aleks Lim @ Sheridan College 2021
 */
public class Deck {

    private ArrayList<Card> deck;
    Suit suit = Suit.BLUE;
    Value value = Value.DRAWFOUR;
    private Card cardStuff = new Card(suit, value); 
    private Suit[] suitList; 
    private Value[] valueList; 

    
    //Empty constructor  
    public Deck() {

    }
    
    //Call this first
    public void initDI(
                       ArrayList<Card> deck, 
                       Suit[] suitList, 
                       Value[] valueList
                       ) 
    {
      
        this.deck = deck;
        this.suitList = suitList;
        this.valueList = valueList; 
    }
    
    //Call First
    public void setMyLists(){
    cardStuff.setSuitList();
    cardStuff.setValueList();
    }
    
    //Call second 
    public void assignMyLists(){
       this.suitList = cardStuff.getSuitList();
       this.valueList = cardStuff.getValueList();
    }

 
    //Of objects as cards with 2 fields 
    //Takes blank array list as param 
    public ArrayList<Card> initDeck(ArrayList<Card> tDeck) {

        //A: 
        //Assumes values list are set elsewhere
        
        
        //B:
        for (int i = 0; i < valueList.length; i++) {
            //C: 
            for (int j = 0; j < suitList.length; j++) {
              
                tDeck.add(new Card(suitList[j], valueList[i]));
            }
        }
        
        //C: 
        return tDeck; 
      
    }
    
  
    //Main functionality here...The old swaperoo!
    //Swap pairs of card objects at random positions / 52.
    //Needs the actually value of this class's field var
    //deck after it's been initialized. 
    public ArrayList<Card> shuffle(ArrayList<Card> tDeck) {

        //A: Create 
        int rando;
        for (int i = 0; i < tDeck.size()-1; i++) {
            rando = (int) (Math.random() * 59) + 1;

            //C: 
            for (int j = 0; j < 1; j++) {

                //C.1: 
                Card temp = tDeck.get(i);
                tDeck.set(i, tDeck.get(rando));
                tDeck.set(rando, temp);

            }//End C

        }
        return tDeck; 
    }
    
    //To set a new deck 
    //Just to reset it if needed
    public void setDeck(ArrayList<Card> newDeck) {
        this.deck = newDeck;
    }
    
    //Normal getter method 
    //Returns value of field var deck of this class
    public ArrayList<Card> getDeck() {
        return deck;
    }
   
    
    //Prints deck stoed in this class's deck field var
    //Assumed to be set from actions elsewhere
    public void printDeck(ArrayList<Card> tDeck) {
        for (int i = 0; i < tDeck.size(); i++) {
            System.out.println(tDeck.get(i).getValue() + " " + tDeck.get(i).getSuit());
        }
    }//End method 

} //End class
