/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class centrepattern {
    public static void main(String[] args)
    {
    int i,j,row=5;
    for(i=1;i<=row;i++)
    {
    
    for(int k =row*2;k>i;k--)
    {
    
    System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    {
    
    System.out.print("* ");
    }
    System.out.println("");
    
    }
    
    
    }
    
}
