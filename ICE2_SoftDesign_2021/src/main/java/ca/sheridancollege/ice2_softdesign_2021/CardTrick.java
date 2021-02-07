/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.ice2_softdesign_2021;

import ca.sheridancollege.ice2_softdesign_2021.Card.Value;
import java.util.ArrayList;

/**
 *
 * @author Aleks Lim @ Sheridan College 2021
 */
public class CardTrick {

    private ArrayList<Card> hand;
    private Card card;

    public CardTrick() {
    }

    public void isItHere(ArrayList<Card> hand, int uValue, String uSuit) {
        for (int i = 0; i < hand.size(); i++) {

        }
    }

    public void isItHereAgain(ArrayList<Card> hand, Card luckyCard) {

        for (int i = 0; i < hand.size(); i++) {

        }
    }//End method 

    public Card.Suit pickASuit(String suit) {
        Card.Suit sResult = Card.Suit.BLUE;
        switch (suit) {
            case "red":
                // code block
                sResult = Card.Suit.RED;
                break;
            case "yellow":
                // code block
                sResult = Card.Suit.YELLOW;
                break;
            case "green":
                // code block
                sResult = Card.Suit.GREEN;
                break;
            case "blue":
                // code block
                sResult = Card.Suit.BLUE;
                break;
            default:
                // code block
                System.out.println("Pick: red, yellow, green, or blue");
                break;
        }
        return sResult;
    }

    public Card.Value pickAValue(int value) {
        Value tValue = Value.DRAWFOUR;
        switch (value) {
            case 0:
                // code block
                tValue = Value.ZERO;
                break;
            case 1:
                // code block
                tValue = Value.ONE;
                break;
            case 2:
                // code block
                tValue = Value.TWO;
                break;
            case 3:
                // code block
                tValue = Value.THREE;
                break;
            case 4:
                // code block
                tValue = Value.FOUR;
                break;
            case 5:
                // code block
                tValue = Value.FIVE;
                break;
            case 6:
                // code block
                tValue = Value.SIX;
                break;
            case 7:
                // code block
                tValue = Value.SEVEN;
                break;
            case 8:
                // code block
                tValue = Value.EIGHT;
                break;
            case 9:
                // code block
                tValue = Value.NINE;
                break;
            default:
            // code block
                break; 
        }
        return tValue;
    }
    
    public Card.Value pickAValue(String value) {
        Value tValue = Value.DRAWFOUR;
        switch (value) {
            case "skip":
                // code block
                tValue = Value.SKIP;
                break;
            case "reverse":
                // code block
                tValue = Value.REVERSE;
                break;
            case "drawtwo":
                // code block
                tValue = Value.DRAWTWO;
                break;
            case "drawfour":
                // code block
                tValue = Value.DRAWFOUR;
                break;
            case "wildcard":
                // code block
                tValue = Value.WILDCARD;
                break;
            default:
            // code block
                break; 
        }
        return tValue;
    }

}//End class
