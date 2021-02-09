/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.ice2_softdesign_2021;

/**
 *
 * @author Aleks Lim @ Sheridan College 2021
 */
public class TurnManager {

    //Field Var's 
    private Player inPlay;
    private Player notInPlay;

    //Constructor 
    public TurnManager() {

    }

    //Getter 
    public Player getInPlay() {
        return inPlay;
    }

    //Setter 
    public void setInPlay(Player newInPlay) {
        this.inPlay = newInPlay;
    }

    //Getter 
    public Player getNotInPlay() {
        return notInPlay;
    }

    //Setter 
    public void setNotInPlay(Player newNotInPlay) {
        this.notInPlay = newNotInPlay;
    }

    //Start Normal Methods 
    public Player turnSwitcher(Player inPlay, Player notInPlay) {
        //A: 
        Player temp = inPlay;
        //B: 
        inPlay = notInPlay;
        notInPlay = temp;
        //C: 
        return inPlay;
    }

}//End class 
