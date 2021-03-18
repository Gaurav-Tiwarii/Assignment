/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
public class pattern {
    
    static int alp=64 ;
    public static void main(String[] args)
    {
    
    int i,row=5,j;
    
    //rows
     for(i=1;i<=row;i++)
     {
       for(int k=2*(row);k>i*2;k--)
       {
       
       System.out.print(" ");
       }
           
           for(j=1;j<=i;j++)
     {
     alp =alp+1;
     
     System.out.print((char)(alp)+" ");
    
     }
     
System.out.println("");     
     }
     
     }



    }
    

