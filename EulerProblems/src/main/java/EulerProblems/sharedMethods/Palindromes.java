/*
This class contains the following methods:
isPalindrome: Checks whether an input is a palindrome
*/
package EulerProblems.sharedMethods;

/*
* @author Richard Bowen
*/
public class Palindromes {
    
    /*
    This method takes an int and outputs a Boolean
    The method compares the first and last characters and if equal works
    inwards until it finds inequality and if not returns true
    */
    public boolean isPalindrome(int n)
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
}
