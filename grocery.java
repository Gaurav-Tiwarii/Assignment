/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
import java.util.*;

public class grocery {

    static int price[] = new int[50], quantity[] = new int[50], budget, left, choice;
    String item[] = new String[50];
    int count = 0;

    public void add() {
        Scanner bud = new Scanner(System.in);

        System.out.print("\n1.Add an item");
        System.out.print("\n2.Exit");
        System.out.print("\nEnter your choice : ");
        choice = bud.nextInt();

        if (choice == 1) {

            System.out.print("\nEnter product : ");

            item[count] = bud.next();
            System.out.print("\nEnter quantity(in kg) : ");
            quantity[count] = bud.nextInt();
            System.out.print("\nEnter price : ");
            price[count] = bud.nextInt();
            left = budget;

            if (left < price[count]) {

                System.out.println("Can't Buy the product ###(because budget left is " + left + ")");

            } else {

                budget = budget - price[count];
                System.out.print("\nAmout left : " + budget);
                count = count + 1;
            }
        } else {
                     
            
            for(int i=0;i<count;i++)
            {
            if(budget>=price[i])
            {
            System.out.println("Amount left can buy you"+item[i]);
            
            }
            
            }
            System.out.print("\n Product name  Quantity  Price");
            for(int i=0;i<count;i++)
            {
            System.out.print("\n "+item[i]);
            System.out.print("            "+quantity[i]);
            System.out.print("       "+price[i]);
            }
                
        }

    }

    public static void main(String[] args) {
        System.out.print("\nEnter your budget : ");
        Scanner bud = new Scanner(System.in);
        budget = bud.nextInt();
        grocery obj = new grocery();
        while (choice != 2) {
            obj.add();

            // System.out.print("\nAmount left "+left);
        }
    }

}
