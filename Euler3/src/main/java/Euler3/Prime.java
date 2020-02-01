/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Euler3;

/**
 *
 * @author Richard
 */
public class Prime {
    public boolean isPrime(long n)
    {
        //Variable that will be returned, by default true
        boolean prime = true;
        //Start at 3 and increment by 2
        for(int i = 3;i<n/2;i=i+2)
        {
            //If the remainder of the division of n by i is 0, return prime as false          
            if(n%i==0)
            {
                prime = false;
                return prime;
            }
        }
        //return the default value if the program gets to here
        return prime;
    }
}
