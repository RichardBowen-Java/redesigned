/*
2520 is the smallest number that can be divided by each of the numbers 
from 1 to 10 without any remainder.

What is the smallest positive number that is evenly 
divisible by all of the numbers from 1 to 20?
 */
package Euler5;

/**
 *
 * @author Richard Bowen
 */
public class Main {
    
    private static boolean isPrime(int n)
    {
        boolean prime = true;
        for(int i = 3;i<n;i=i+2)
        {
            if(n%i==0)
            {    
                prime = false;
                return prime;
            }    
        }
        return prime;
    }
    
    private static int[] primeList(int n)
    {
        int[] primes = new int[n/2 + 1];
        int index = 0;
        for(int i = 2;i<n;i++)
        {
            if(isPrime(i))
            {
                primes[index] = i;
                index++;
            }
        }
        return primes;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[] prim = primeList(20);
    int[] powers = new int[prim.length];
    for(int i = 0;i<prim.length;i++)
    {
        
    }
        
    
    }
}