/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.ice2_softdesign_2021;

import java.util.ArrayList;

/**
 *
 * @author Aleks Lim @ Sheridan College 2021
 */
public class Player {
    
    private String name;
    private ArrayList<Card> hand; 
    
    public Player(){
    
    }
    
    public String getName(){
    return name;
    }
    public void setName(String newName){
    this.name = newName;
    }
    
    public ArrayList<Card> getHand()
    {
        return hand; 
    }
    
    public void setHand(ArrayList<Card> newHand){
    this.hand = newHand; 
    }
    
}//End class
