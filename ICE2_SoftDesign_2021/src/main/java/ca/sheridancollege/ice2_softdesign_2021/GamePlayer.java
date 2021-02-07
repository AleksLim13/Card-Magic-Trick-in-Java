package ca.sheridancollege.ice2_softdesign_2021;

import java.util.ArrayList;



/**
 * A class to handle the user interaction for the Card
 * project. Contains a main method that generates a card hand
 * and then iterates over it to print its contents to the console.
 * @author Aleks Lim @ Sheridan College 2021
 */
public class GamePlayer {
    
    private enum testeroo{ONE, TWO, THREE, FOUR, FIVE};

	public static void main(String[] args) {
		//CardHand ch = new CardHand();
                //ch.generateHand();
                //for(Card c: ch.cards)
                //{
                  //  System.out.println(c.getValue() + " of " + c.getSuit());
                //}
               // System.out.println(ch.cards); show what happens when there is no toString()
               //System.out.println(Value.values());
               
               testeroo[] testList = testeroo.values();
               System.out.println(testList.length);
               
	}

}