/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Jeremy
 */
public class Card {
    
    Float CardValue;
    String CardCondition;
    
    public Card(Float cardValue,String cardCondition)
    {
        CardValue = cardValue;
        CardCondition = cardCondition;
    }
    
    public Float getValue()
    {
        Float Multiplier = 1.0f;
        
        if("Near Mint".equals(CardCondition))
        {
            Multiplier = 5.0f;
        }
        if("Lightly Played".equals(CardCondition))
        {
            Multiplier = 2.0f;
        }
        if("Moderatly Played".equals(CardCondition))
        {
            Multiplier = 1.0f;
        }
        if("Heavily Played".equals(CardCondition))
        {
            Multiplier = 0.5f;
        }
        if("Damaged".equals(CardCondition))
        {
            Multiplier = 0.25f;
        }
        
        CardValue = CardValue*Multiplier;
        return CardValue;
    }
}
