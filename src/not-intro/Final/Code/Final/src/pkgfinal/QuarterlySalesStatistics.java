package pkgfinal;

import java.util.Scanner;

public class QuarterlySalesStatistics
{
	public static void dataEntry(int [][] companyFigures) {
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0; i < companyFigures.length; i++){
			for(int j = 0; j < companyFigures[0].length; j++) {
				System.out.print("Enter division " + (i+1) + "'s sales figure for quarter " + (j+1) + ": ");
				companyFigures[i][j] = keyboard.nextInt();
				while(companyFigures[i][j] < 0){
					System.out.println("Sales figure cannot be negative! Please try again.");
					System.out.print("Enter division " + (i+1) + "'s sales figure for quarter " + (j+1) + ": ");
					companyFigures[i][j] = keyboard.nextInt();
				}
					
			}
		}
	}
	
	public static void showFigures(int [][] companyFigures) {
		
		System.out.println("\n=== Quarterly Sales Figures ===\n");
		System.out.println("-----------\nLISTING\n-----------");
		
		int change;
		
		for(int i = 0; i < companyFigures.length; i++){
			change = 0;
			
			System.out.println("\nDivision: " + (i+1) + "\n-----------");
				
			for(int j = 0; j < companyFigures[0].length; j++) {
				if(j >= 1) {
					change = companyFigures[i][j] - companyFigures[i][j-1];
					if (change >= 1) {
						System.out.println("Quarter " + (j+1) + ": " + companyFigures[i][j] + " (+" + change + ")");
					} else {
						System.out.println("Quarter " + (j+1) + ": " + companyFigures[i][j] + " (" + change + ")"); 
					}
				}else{
					System.out.println("Quarter " + (j+1) + ": " + companyFigures[i][j]);
				}
			}
		}
	}
	
	public static void calcQuarterSales(int[][] companyFigures, int NUMQUARTERS, int NUMDIVISIONS) {
		int totalQuarterSales;
		int[] totalQuarterSalesArray = new int[NUMQUARTERS];
		int change;
		
		System.out.println("\n-----------\nStatistics\n-----------\n");
		
		
		for(int j = 0; j < companyFigures[0].length; j++){
			
			totalQuarterSales = 0;
			
			for(int i = 0; i < companyFigures.length; i++) {
				totalQuarterSales += companyFigures[i][j];
			} // end inner for
			
			change = 0;
			totalQuarterSalesArray[j] = totalQuarterSales;
			
			System.out.println("Quarter " + (j+1));

			// Totals
			if(j >= 1) {
				change = totalQuarterSalesArray[j] -  totalQuarterSalesArray[j-1];
				if( change >= 1){
					System.out.println("\t\tTotal: " + totalQuarterSalesArray[j] + " (+" + change + ")");
				} else {
					System.out.println("\t\tTotal: " + totalQuarterSalesArray[j] + " (" + change + ")");
				}
			} else {
				System.out.println("\t\tTotal: " + totalQuarterSalesArray[j]);
			}
			

                        
			Double avg = (totalQuarterSalesArray[j] / (NUMDIVISIONS * 1.0));
			avg = Math.round(avg*100.0)/100.0;
			System.out.printf("\t\tAverage: %.2f\n", avg);
			

                        int highestSale = 0;
			int highestDivision = 0;
			
			for(int i = 0; i < companyFigures.length; i++) {
				if(companyFigures[i][j] > highestSale) {
					highestSale = companyFigures[i][j];
					highestDivision = i + 1;
				}
			}
			System.out.println("\t\tHighest sales: division " + highestDivision + " (" + highestSale + ")");
			
			
		} 
	}
	
	
	public static void main(String[] args) {
		int NUMDIVISIONS = 6;
		int NUMQUARTERS  = 4;
		
		
		int[][] companyFigures = new int[NUMDIVISIONS][NUMQUARTERS];
		
		dataEntry(companyFigures);
		showFigures(companyFigures);
		calcQuarterSales(companyFigures, NUMQUARTERS, NUMDIVISIONS);
	}

}