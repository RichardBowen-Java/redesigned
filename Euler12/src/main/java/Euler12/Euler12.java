/*
The sequence of triangle numbers is generated by adding the natural numbers. 
So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. 
The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?
 */
package EulerProblems.Problems;

//Java class imports
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//personal class imports
import EulerProblems.sharedMethods.Division;
/**
 *
 * @author Richard Bowen
 */
public class Euler12 extends EulerProblems.Problem{

    /**
     * 
     */
    public Euler12()
    {
        this.name = "Euler 1";
    }
    
    @Override 
    public void Solution() 
    {
    Division div = new Division();    
    long startTime = System.currentTimeMillis();        
    // TODO code application logic here
        int divisors = 1;
        int index = 1;
        long sum = 0;
        long max = 0;
            while(divisors<501)        
            {
            sum+=index;
            divisors = numberOfDivisors(sum);
            index++;
                if(divisors>max)
                {
                    max = divisors;
                    System.out.println("index:" + (index - 1));
                    System.out.println("sum:" + sum);
                    System.out.println("max:" + max);
                    System.out.println();
                }
            }

        
        Long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}