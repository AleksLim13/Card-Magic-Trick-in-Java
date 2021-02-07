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
public class Dealer {

    private Deck deck;
    private ArrayList<Card> hand;

    private Suit suit = Suit.BLUE;
    private Value value = Value.DRAWFOUR;

    public Dealer() {

    }

    public void deckSetup() {
        deck.initDI(new Card(suit, value), new ArrayList<>());
        deck.initDeck();
        deck.shuffle();
    }

    //Deal first card and simultaneously remove it from deck
    //Like in real life...
    public Card startDeal() {

        Card card;
        //A: 
        card = deck.getDeck().get(0);

        //B: 
        deck.getDeck().remove(0);

        //C: 
        return card;
    }
    
    public void createHand(int size) {

        for (int i = 0; i < size; i++) {

            hand.add(this.startDeal());
        }

    }
    
    public void printHand(){
     for(int i = 0; i < hand.size(); i++){
         System.out.println(hand.get(i).getValue() + " " + hand.get(i).getSuit());
     }
    }

}//End class
