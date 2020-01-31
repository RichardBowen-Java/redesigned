/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Richard_David_Bowen_library;

/**
 *
 * @author Richard
 */
public class Timer {
    private long startTime;
    private long endTime;
    public Timer()
    {
         startTime = System.currentTimeMillis(); 
    }
    public void end()
    {
        endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
    
}

