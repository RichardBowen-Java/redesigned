/*
A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
package EulerProblems.Problems;
import EulerProblems.sharedMethods.Palindromes;

/**
 *
 * @author Richard Bowen
 */
public class Euler4 extends EulerProblems.Problem {
    public Euler4()
    {
        this.name = "Euler 4";
    }
    
  
       
    //Solution implementation
    @Override
    public void Solution() {
              
        // variable to hold the maximum value
        Palindromes pal = new Palindromes();
        int max = 0;        
        //iterate downwards from 999 for i and then j until a palindrome is found 
        for(int i = 999;i>100;i--)
        {
            for(int j = 999;j>i;j--)
            {
                //If a palindrome is found, compare it to the current max
                //If higher, replace max with this value.
                if(pal.isPalindrome(i*j))
                {
                    if(i*j>max)
                    {
                        max = i*j;
                    }
                    
                }
            }
        }
        System.out.println(name + ": " + max);
        
    }
    
}
