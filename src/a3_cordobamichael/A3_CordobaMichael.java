/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Created by Michael Cordoba
 * Date created 2/1/2015
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
        
        float cost;
        
        do{
            System.out.print("Enter cost : ");
        
            cost = input.nextFloat();
        
            if (cost < 0) {
                System.out.println("Please enter a positive value for cost");
            }
            if (cost > 100000){
                System.out.println("Please enter a value for cost < 100000");
            }
        }while(cost < 0 || cost > 100000);
        
        System.out.print("\nEnter estimated life : ");
        int years = input.nextInt();
        
        System.out.println();
        
        float depreciationRate = (((cost/years)*2)/cost);
        float depreciation;
        float totalDep = 0;
        
        System.out.printf("%-10s%-20s%-21s%s\n", "Year", "Start Value", "Amt Depreciated", "Total Depreciation");
        
        for(int i = 1; i <= years; i++){
            depreciation = cost * depreciationRate;
            if(i == years){
                depreciation = cost;
            }
            totalDep += depreciation;
            System.out.printf("%-10d$%-19.2f$%-20.2f$%.2f\n", i, cost, depreciation, totalDep);
            cost  -= depreciation;
            
        }
        
    }
    
}
