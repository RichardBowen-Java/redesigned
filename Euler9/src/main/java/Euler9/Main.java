/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a² + b² = c²
For example, 3² + 4² = 9 + 16 = 25 = 5².

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
package Euler9;

/**
 *
 * @author Richard
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Using euclids formula where a = k(m² - n²), b = 2kmn, c = k(m² + n²) 
        //initiate variables to start at 1
        int m = 1;
        int n = 1;
        int k = 1;
        //set break point for loop exit
        loop:
        while(true)
        {
            //iterate from 1 to 1000;
            for(m = 1;m<1000;m++)
            {
                //iterate from 1 until less than m
                for(n = 1; n<m;n++)
                {
                    //by using a + b + c = 1000, substituting the values of m,n and k we get the formula below
                    if(k*m*(m+n)==500)
                    {
                        //break out of the while loop
                        break loop;
                    }
                }
            }
            k++;
        }    
        System.out.println("a = "+ k*(m*m - n*n));
        System.out.println("b = "+ k*(2*m*n));
        System.out.println("c = "+ k*(m*m + n*n));
    }
    
}
