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
   

  

    public Dealer() {

    }
    
    //I hate null pointer exception!
    public Dealer(Deck deck, ArrayList<Card> hand) {
        this.deck = deck;
        this.hand = hand; 
    }

    public void deckSetup(Card card, ArrayList<Card> blank) {
      deck.initDI(new ArrayList<>(), new Suit[4], new Value[15]);
      deck.setMyLists();
      deck.assignMyLists();
      deck.setDeck(deck.initDeck(blank));
      deck.setDeck(deck.shuffle(deck.getDeck()));
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
    
    public void printHand(ArrayList<Card> tHand){
     for(int i = 0; i < tHand.size(); i++){
         System.out.println(tHand.get(i).getValue() + " " + tHand.get(i).getSuit());
     }
    }
    
    public ArrayList<Card> getHand(){
    return hand; 
    }

}//End class
