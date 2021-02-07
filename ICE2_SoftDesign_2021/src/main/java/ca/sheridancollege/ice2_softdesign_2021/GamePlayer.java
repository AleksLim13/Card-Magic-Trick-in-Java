package ca.sheridancollege.ice2_softdesign_2021;

import ca.sheridancollege.ice2_softdesign_2021.Card.Suit;
import ca.sheridancollege.ice2_softdesign_2021.Card.Value;
import java.util.ArrayList;



/**
 * A class to handle the user interaction for the Card
 * project. Contains a main method that generates a card hand
 * and then iterates over it to print its contents to the console.
 * @author Aleks Lim @ Sheridan College 2021
 */
public class GamePlayer {
    
    

	public static void main(String[] args) {
		//CardHand ch = new CardHand();
                //ch.generateHand();
                //for(Card c: ch.cards)
                //{
                  //  System.out.println(c.getValue() + " of " + c.getSuit());
                //}
               // System.out.println(ch.cards); show what happens when there is no toString()
               //System.out.println(Value.values());
               
              //A: Create dealer and player object 
              Dealer dealer = new Dealer(new Deck(), new ArrayList<>());
              Player player01 = new Player();
             
              //B: Do deck setup routines 
              dealer.deckSetup(new Card(), new ArrayList<>()); 
              
              //C: Have the dealer create the hand for the player 
              dealer.createHand(7);
              
              //D: Use player object to set the players hand from dealer
              player01.setHand(dealer.getHand());
              
              //E: Have the dealer print out the players hand
              dealer.printHand(player01.getHand());
              
               
	}//End main 

}//End class