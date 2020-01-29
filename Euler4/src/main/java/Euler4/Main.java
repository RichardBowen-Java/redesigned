/*
A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
package Euler4;

/**
 *
 * @author Richard Bowen
 */
public class Main {
    //This method takes an int and outputs a Boolean
    //The method compares the first and last characters and if equal works
    //inwards until it finds inequality and if not returns true
    public static boolean isPalindrome(int n)
    {
        String input = Integer.toString(n);
        boolean isPal = true;
        int len = input.length() - 1;
        for(int i = 0;i<len;i++)
        {
           if(input.charAt(i)!= input.charAt(len-i))
           {
                isPal = false;
                return isPal;
           }
        }
        return isPal;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable to hold the maximum value
        int max = 0;        
        //iterate downwards from 999 for i and then j until a palindrome is found 
        for(int i = 999;i>100;i--)
        {
            for(int j = 999;j>i;j--)
            {
                //If a palindrome is found, compare it to the current max
                //If higher, replace max with this value.
                if(isPalindrome(i*j))
                {
                    if(i*j>max)
                    {
                        max = i*j;
                    }
                    
                }
            }
        }
        System.out.println(max);     
    }
    
}
