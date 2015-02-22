/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos;





/**
 *
 * @author ASUS-PC
 */
public class NumericalIntegration {
    
    
    
    
   
    public double calculateGamma(int num, int den){           
        int result = num%den; 
        
        if(result == 0)
            return calculateFactorial((num/den)-1);
        else
            return calculateGammaNonInteger((long)num, (long)den);
            
    }
    
    
    public double calculateGammaNonInteger(long num, long den){
        
        long acum = num - 2;        
        long numM = acum - 2;
        
        
        while(numM > 0){
            acum *= numM;
            numM -= 2;
            den *= 2;
        }
        
         return (acum * Math.sqrt(Math.PI))/(double)den; 
    }
    
    public double calculateFactorial(int value) {
        long res = 1;
        for (int i = 1; i <= value; i++) {
            res *= i;
        }
        return new Double(res);
    }
    
    public double calculateFunction(int dof, double value) {
        double res = calculateGamma(dof+1, 2);        
        res = res/((Math.sqrt(dof*Math.PI)) * calculateGamma(dof, 2));        
        res = res * (Math.pow((double)1/(1 + ((Math.pow(value, 2))/dof)), (dof+1)/(double)2));      
        return res;
    }
    
    public double calculateIntegralValue(int numSeg, double x, int dof){
        
        double p = 0;
        double w = x/numSeg;
        
        for (int i = 0; i < numSeg + 1; i++) {
            int multiplier = 1;
            
            if(i!=0 && i!=numSeg)
                multiplier = i%2==0?2:4;
            double terms = calculateFunction(dof, i*w);
            
            terms = terms * (w/3) * multiplier;
            p += terms;
        }
        
        return p;
    }
}
