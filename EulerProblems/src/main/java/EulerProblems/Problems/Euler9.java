/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a� + b� = c�
For example, 3� + 4� = 9 + 16 = 25 = 5�.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
package EulerProblems.Problems;

/**
 *
 * @author Richard
 */
public class Euler9 extends EulerProblems.Problem {
    public Euler9()
    {
        this.name = "Euler 9";
    }
    @Override
    public void Solution() {
 
        // Using euclids formula to paramaterise the triplets
        // a = k(m� - n�), b = 2kmn, c = k(m� + n�) 
        // initiate k,m and n variables to start at 1
        int m = 1;
        int n = 1;
        int k = 1;
        //set loop exit point
        loop:
        while(true)
        {
            //iterate from 1 to 999;
            for(m = 1;m<1000;m++)
            {
                //iterate from 1 until less than m as n is always less than m
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
        //print out a,b and c using the parameterisations and the values of k,m and n derived above
        System.out.println(name + ": a = "+ k*(m*m - n*n)+"; b = "+ k*(2*m*n)+"; c = "+ k*(m*m + n*n));
       
    }
    
}
