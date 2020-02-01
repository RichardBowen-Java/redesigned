/*
2520 is the smallest number that can be divided by each of the numbers 
from 1 to 10 without any remainder.

What is the smallest positive number that is evenly 
divisible by all of the numbers from 1 to 20?
 */
package EulerProblems.Problems;
import EulerProblems.sharedMethods.Prime;
/**
 *
 * @author Richard
 */
public class Euler5 extends EulerProblems.Problem {
    
    //Constructor
    public Euler5()
    {
        this.name = "Euler 5";
    }
    
    //Solution implementation
    @Override
    public void Solution(){
    
    Prime pri = new Prime();
        
    int[] prim = pri.primeList(20);
    int[] powers = new int[prim.length];
    for(int i = 0;i<prim.length;i++)
        {
            
        }   
        
    }
}
