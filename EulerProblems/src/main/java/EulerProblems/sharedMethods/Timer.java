/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EulerProblems.sharedMethods;

/**
 *
 * @author Richard
 */
public class Timer {
    private long startTime;
    private long endTime;
    String problem;
    public Timer(String p)
    {
         startTime = System.currentTimeMillis();
         problem = p;
    }
    public void end()
    {
        endTime = System.currentTimeMillis();
        System.out.println(problem + " took " + (endTime - startTime) + " milliseconds");
    }
    
}

