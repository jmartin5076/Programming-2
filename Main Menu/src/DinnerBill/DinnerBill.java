/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DinnerBill;

/**
 *
 * @author Jeremy Martin
 */
public class DinnerBill {
    
    float total,percent,tip,grandTotal;
    
    public void DinnerBill()
    {
        total = 0.0f;
        percent = 0;
    }
    
    public Float getTotal()
    {
      return total;  
    }
    
    public Float getPercent()
    {
      return percent;  
    }
    
    public Float CalculateTip (float total,float percent)
    {
        percent = percent/100;
        tip = total*percent;
        return tip;
    }
  
    public void CalculateTotal (float total,float tip)
    {
        grandTotal = total+tip;
    }
    
    public Float getGrandTotal()
    {
        return grandTotal;
    }
}
