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
public class Collection_Total {
    
    Float CollectionTotal;
    
    public Collection_Total()
    {
        CollectionTotal = 0.0f;
    }
    
    public void AddCard(Card c)
    {
        CollectionTotal += c.getValue();
    }
    
    public Float getCollectionTotal()
    {
        return CollectionTotal;
    }
}
