/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiat;

/**
 *
 * @author Dell
 */
public class test {
    
    public static void main(String[] args) {
        Employe emp1= new Employe(344,"Ebb","manoharan","991551956v","colombo");
        Employe emp2= new Employe(344,"Ebb","manoharan","991551956v","colombo");
        
        System.out.println(emp1.equals(emp2));
        
        Employe emp3=emp1;
        
        System.out.println(emp3.equals(emp1));
        
        emp1=emp2;
        System.out.println(emp1.equals(emp2));
    }
    
}
