/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.controller;

import edu.uniandes.ecos.NumericalIntegration;

/**
 *
 * @author ASUS-PC
 */
public class ConsoleController {
    
    public static void main( String[] args )
    {
        NumericalIntegration numericalIntegration = new NumericalIntegration();
        System.out.println( "0 to x= 1.1     p=" + numericalIntegration.calculateIntegralValue(10, 1.1, 9)); 
        System.out.println( "0 to x= 1.1812  p=" + numericalIntegration.calculateIntegralValue(10, 1.1812, 10)); 
        System.out.println( "0 to x= 2.750   p=" + numericalIntegration.calculateIntegralValue(10, 2.750, 30));       
    }
    
}
