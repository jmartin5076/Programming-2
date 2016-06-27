/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

/**
 *
 * @author Jeremy
 */
public class WorldClock extends Clock {
   
    public WorldClock(int offset)
    {
        hours = 0+offset;
        minutes = 0;
    }
    
    public static int getHours(int offset)
    {
        hours =  Clock.getHours() +offset;
        return hours;
    }
}
