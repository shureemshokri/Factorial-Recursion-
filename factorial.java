/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Shureem Shokri
 */
public class GUI {
        

    
    public static void main(String[] args) {
       
        System.out.println(fact(4));
    }
    
    
    public static int fact(int n) {
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    
}
