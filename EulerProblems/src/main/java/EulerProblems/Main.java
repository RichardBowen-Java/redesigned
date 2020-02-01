/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EulerProblems;
import java.util.ArrayList;
import EulerProblems.sharedMethods.Timer;
//import java.util.Iterator;

import EulerProblems.Problems.Euler1;
import EulerProblems.Problems.Euler2;
import EulerProblems.Problems.Euler3;
import EulerProblems.Problems.Euler4;
//import EulerProblems.Problems.Euler5;
import EulerProblems.Problems.Euler6;
//import EulerProblems.Problems.Euler7;
//import EulerProblems.Problems.Euler8;
import EulerProblems.Problems.Euler9;
//import EulerProblems.Problems.Euler10;
//import EulerProblems.Problems.Euler11;
import EulerProblems.Problems.Euler12;
/**
 *
 * @author Richard
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Timer overallTimer = new Timer("Overall");
        ArrayList<Problem> list = new ArrayList<Problem>();
        list.add(new Euler1());
        list.add(new Euler2());
        list.add(new Euler3());
        list.add(new Euler4());
        //list.add(new Euler5());
        list.add(new Euler6());
        //list.add(new Euler7());
        //list.add(new Euler8());
        list.add(new Euler9());
        //list.add(new Euler10());
        //list.add(new Euler11());
        list.add(new Euler12());
        
        for(int i = 0;i<list.size();i++)
        {    
        Timer newTimer = new Timer(list.get(i).name);
        list.get(i).Solution();
        newTimer.end();
        System.out.println();
        }
        overallTimer.end();
        
    }
    
}
