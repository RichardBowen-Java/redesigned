/*
Project Euler Problem 2
If we list all the natural numbers below 10 that are multiples of 3 or 5, 
we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
 
 */
package Euler1;

/**
 *
 * @author Richard Bowen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable sum will be used to store the sum of the numbers
        int sum = 0;
        
        //Iterate from 1 to 999 and if divisible by three or five, add it to sum
        for(int i = 1;i<1000;i++)
        {
            if(i%3==0||i%5==0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    
}
