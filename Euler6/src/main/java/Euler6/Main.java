/*
The sum of the squares of the first ten natural numbers is,

12+22+...+102=385
The square of the sum of the first ten natural numbers is,

(1+2+...+10)2=552=3025
Hence the difference between the sum of the squares of the first 
ten natural numbers and the square of the sum is 3025?385=2640.

Find the difference between the sum of the squares of the 
first one hundred natural numbers and the square of the sum.
 */
package Euler6;

/**
 *
 * @author Richard
 */
public class Main {

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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num = 100;
    System.out.println(squareSum(num) - sumSquare(num));    
        
    }
    
}
