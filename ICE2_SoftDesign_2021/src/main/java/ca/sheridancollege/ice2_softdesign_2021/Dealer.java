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
    
    public Dealer(){
        
    }
    
    public void deckSetup(){
        deck.initDI(new Card(suit, value), new ArrayList<>());
        deck.initDeck();
        deck.shuffle();
    }
    
}//End class
