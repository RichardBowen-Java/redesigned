/*
The sum of the squares of the first ten natural numbers is,

1²+2²+...+10²=385
The square of the sum of the first ten natural numbers is,

(1+2+...+10)²=55²=3025
Hence the difference between the sum of the squares of the first 
ten natural numbers and the square of the sum is 3025 - 385=2640.

Find the difference between the sum of the squares of the 
first one hundred natural numbers and the square of the sum.
 */
package EulerProblems.Problems;
//import EulerProblems.sharedMethods.Palindromes;

/**
 *
 * @author Richard Bowen
 */
public class Euler6 extends EulerProblems.Problem {
    public Euler6()
    {
        this.name = "Euler 6";
    }
    
    public static int sumSquare(int n)
    {
        int sumSquare = 0;
        for(int i = 1;i<=n;i++)
        {
        sumSquare+=i*i;
        
        }
    
        return sumSquare;
        
    }
    
    public static int squareSum(int n)
    {
        int squareSum = 0;
        for(int i = 1;i<=n;i++)
        {
        squareSum+=i;
        }
        
        return squareSum*squareSum;
        
    }
    
       
    /**
     * 
     */
    public void Solution() {
      
    
    int num = 100;
    System.out.println(name + ": " + (squareSum(num) - sumSquare(num)));  
    
}
    
}
