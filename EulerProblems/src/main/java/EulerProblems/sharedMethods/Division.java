/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EulerProblems.sharedMethods;

/**
 *
 * @author Richard
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Division{

public int numberOfDivisors(long currentSum)
    {
        ArrayList <Long> rootOfSum = new ArrayList<Long>(0);
        ArrayList <Long> remainder = new ArrayList<Long>(0);
        long squareRoot = (long) Math.sqrt((double)currentSum);
        
        for (long i = 1;i<squareRoot;i++)
        {
            if(currentSum%i==0)
            {
                rootOfSum.add(i);
            }
        }
        for (int i = 0;i<rootOfSum.size();i++)
        {
            remainder.add(currentSum/rootOfSum.get(i));
        }
        rootOfSum.addAll(remainder);
        List<Long> divisorsWithoutDuplicates = rootOfSum.stream().distinct().collect(Collectors.toList());
        return divisorsWithoutDuplicates.size();
    }

}

    