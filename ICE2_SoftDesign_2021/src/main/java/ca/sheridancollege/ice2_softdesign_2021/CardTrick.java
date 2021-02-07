/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.ice2_softdesign_2021;

import java.util.ArrayList;

/**
 *
 * @author aleks
 */
public class CardTrick {
    public CardTrick(){
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
    }//End method 
    
}//End class
