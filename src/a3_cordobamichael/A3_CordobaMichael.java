/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3_cordobamichael;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class A3_CordobaMichael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float cost = -1;
        
        while(cost < 0 || cost > 100000){
            System.out.print("Enter cost : ");
        
            cost = input.nextFloat();
        
            if (cost < 0) {
                System.out.println("Please enter a positive value for cost");
            }
            if (cost > 100000){
                System.out.println("Please enter a value for cost < 100000");
            }
        }
        
        System.out.print("\nEnter estimated life : ");
        
        int years = input.nextInt();
        
        float depreciationRate = (((cost/years)*2)/cost);
        float depreciation;
        float totalDep = 0;
        
        System.out.println("Year\tStart Value\tAmt Depreciation\tTotal Depreciation");
        
        for(int i = 1; i <= years; i++){
            depreciation = cost * depreciationRate;
            if(i == years){
                depreciation = cost;
            }
            totalDep += depreciation;
            System.out.print(i + "\t");
            System.out.print("$" + cost);
            System.out.print("\t\t");
            System.out.print("$" + depreciation);
            System.out.print("\t\t\t");
            System.out.print("$" + totalDep);
            System.out.print("\n");
            cost  -= depreciation;
            
        }
    }
    
}
