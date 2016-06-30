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
        return CardValue;
    }
}
