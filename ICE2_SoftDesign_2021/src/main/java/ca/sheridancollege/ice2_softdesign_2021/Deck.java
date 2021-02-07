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

    private Card cardStuff;
    private ArrayList<Card> deck;

    
    //Empty constructor  
    public Deck() {

    }

    //Call this first
    public void initDI(Card cardStuff, ArrayList<Card> deck) {
        this.cardStuff = cardStuff;
        this.deck = deck;
    }

 
    //Of objects as cards with 2 fields 
    //Takes blank array list as param 
    public void initDeck() {

        //A: 
        cardStuff.quickListSet();
        Value[] vTemp = cardStuff.getValueList();
        Suit[] sTemp = cardStuff.getSuitList();
        
        for (int i = 0; i < vTemp.length; i++) {
            //C: 
            for (int j = 0; j < sTemp.length; j++) {
              
                deck.add(new Card(sTemp[j], vTemp[i]));
            }
        }
      
    }
    
  
    //Main functionality here...The old swaperoo!
    //Swap pairs of card objects at random positions / 52.
    //Needs the actually value of this class's field var
    //deck after it's been initialized. 
    public void shuffle() {

        //A: Create 
        int rando;
        for (int i = 0; i < deck.size(); i++) {
            rando = (int) (Math.random() * 60) + 1;

            //C: 
            for (int j = 0; j < 1; j++) {

                //C.1: 
                Card temp = deck.get(i);
                deck.set(i, deck.get(rando));
                deck.set(rando, temp);

            }//End C

        }
        
    }
    
    //To set a new deck 
    //Just to reset it if needed
    public void setDeck(ArrayList<Card> newDeck) {
        this.deck = newDeck;
    }
   
    
    //Prints deck stoed in this class's deck field var
    //Assumed to be set from actions elsewhere
    public void printDeck() {
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i).getValue() + " " + deck.get(i).getSuit());
        }
    }

 
    //Normal getter method 
    //Returns value of field var deck of this class
    public ArrayList<Card> getDeck() {
        return deck;
    }

    
    

} //End class
