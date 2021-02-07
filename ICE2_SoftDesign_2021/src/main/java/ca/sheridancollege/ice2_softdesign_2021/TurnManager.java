/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.ice2_softdesign_2021;

import java.util.ArrayList;


/**
 * A class that models playing card Objects. Cards have a value (note that Ace =
 * 1, Jack -11, Queen =12, King = 13) A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers. This code is to be used in ICE1.
 * When you create your own branch, add your name as a modifier.
 *
 * @author Aleks Lim @ Sheridan College 2021
 */
public class TurnManager {

  
    public void printHand(ArrayList<Card> hand){
     for(int i = 0; i < hand.size(); i++){
         System.out.println(hand.get(i).getValue() + " " + hand.get(i).getSuit());
     }
    }
    
    public void isItHere(ArrayList<Card> hand, int uValue, String uSuit){
     for(int i = 0; i < hand.size(); i++){
         //if(hand.get(i).getValue() == uValue && hand.get(i).getSuit().equals(uSuit)){
            // System.out.println("It's in here at position " + i);
         //}   
     }
    }
    
    public void isItHereAgain(ArrayList<Card> hand, Card luckyCard){
        //String uSuit = luckyCard.getSuit();
        //int uValue = luckyCard.getValue();
     for(int i = 0; i < hand.size(); i++){
         //if(hand.get(i).getValue() == uValue && hand.get(i).getSuit().equals(uSuit)){
            // System.out.println("It's in here at position " + i);
         //}   
     }
    }
    
    
    
    
  

}//End class 
