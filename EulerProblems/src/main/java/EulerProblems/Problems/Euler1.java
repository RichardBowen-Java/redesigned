/*
Project Euler Problem 1

If we list all the natural numbers below 10 that are multiples of 3 or 5, 
we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
package EulerProblems.Problems;
/*
 @author Richard Bowen
*/
public class Euler1 extends EulerProblems.Problem{

    //constructor
    public Euler1()
    {
        this.name = "Euler 1";
    }
    
    //Solution implementation 
    @Override        
    public void Solution() {
        // Variable sum will be used to store the sum of the numbers
        int sum = 0;
        
        //Iterate from 1 to 999 and if divisible by three or five, add it to sum
        for(int i = 1;i<1000;i++)
        {
            if(i%3==0||i%5==0&&i%15!=0)
            {
                sum+=i;
            }
        }
        System.out.println(name + ": " + sum);
    }
}
