/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
package EulerProblems.Problems;

//personal class imports
import EulerProblems.sharedMethods.Prime;

/*
* @author Richard Bowen
*/

public class Euler3 extends EulerProblems.Problem{

    //Constructor
    public Euler3()
    {
        this.name = "Euler 3";
    }
    
    //Solution implementation
    @Override
    public void Solution() {
        
        //Instantiate variables to hold the number, max prime and an iterator i 
        long n = 600851475143L;
        long max = 0;
        long i = 3;
        //Create new prime class instance to use methods        
        Prime Pri = new Prime();
        //This will run until max is changed to anything other than 0        
        while(max==0)
            {
                //If the remainder is 1, then check if it is a prime
                //This will start with the number and 
                if(n%i==0)
                {
                    if(Pri.isPrime(n/i))
                    {
                        //This is the terminating condition of the loop
                        max = n/i;
                    }
                    //make n equal to the value of n/i for the next round of the loop
                    n/=i;
                }    
                //iterate i by 2 to only use odd numbers 
                i=i+2;
            }
            System.out.println(name + ": " + max);
            
        }
        
       
    }
    

