/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */
package Euler3;

/**
 *
 * @author Richard Bowen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long n = 600851475143L;
        
        while(n > 1)
        {
            n/=2;
            System.out.println(n);
        }
    }
    
}
