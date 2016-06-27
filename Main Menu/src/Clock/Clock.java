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
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;

public class Clock {
    
    static Calendar cal = new GregorianCalendar();
    static DecimalFormat fmt = new DecimalFormat("00");
    
   static int hours,minutes,AM_PM,offset;
    
    public Clock()
    {
        hours = 0;
        minutes = 0;
    }
    
    public static int getHours()
    {
       hours = cal.get(Calendar.HOUR);
       return hours;
    }
    
    public static int getMinutes()
    {
        minutes = cal.get(Calendar.MINUTE);
        return minutes;
    }
    
    public static int getAM_PM()
    {
        AM_PM = cal.get(Calendar.AM_PM);
        return AM_PM;
    }
    
    public static String getTime(int offset)
    {
        String time,day = "";
        
        AM_PM = getAM_PM();
        
         if(AM_PM==1)
         {
             day = "PM";
         }
         else
         {
             day = "AM";
         }
                        
        if (offset!=0)
        {
            hours = WorldClock.getHours(offset);

            if (hours>12)
            {
                hours-=12;
                
                if(AM_PM==1)
                {
                    day = "AM";
                }
                else
                {
                    day ="PM";
                }
            }
            
            if (hours<1)
            {
                hours+=12;
            }
 
            minutes = getMinutes();
            time = hours+":"+fmt.format(minutes)+day;
            return time;
        }
        else
        {
            hours = getHours();
            minutes =getMinutes();
            time = hours+":"+fmt.format(minutes)+day;
            return time;
        }
    }
}
