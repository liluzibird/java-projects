package m12;

import java.util.Scanner;

public class rainFall {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
	    final int SIZE = 12;
		double[] monthlyRain = new double[SIZE];
		
		System.out.println("Enter the monthly rain fall amount: ");
		int i = 0;
		
		// Added input validation with 'Do-While Loop'
		for(i = 0; i < SIZE; i++){
			
			do{
				System.out.print("Month " + (i+1) + ": ");
				monthlyRain[i] = keyboard.nextDouble();
			}
			while(monthlyRain[i] < 0);
			
		}		
	
		System.out.println("The annual sum of rain: " + sumRain(monthlyRain));
		System.out.println("The average sum of rain: " + averageRain(monthlyRain));
		System.out.println("The most amount of rain fall: " + mostRain(monthlyRain));
		System.out.println("The least amount of rain fall: " + leastRain(monthlyRain));
	}		
	
	// Create a function that returns the total rainFall for the year.
	
	static double sumRain(double[] array){
		double sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
			}
		return sum;
		}
	
	// Create a function that returns the average monthly rainFall for the year.
	static double averageRain(double[] array){
		double average = 0;
		average = sumRain(array)/array.length;
		return average;
	}
	
	// Create a function that returns the month with the most rain.
	static double mostRain(double[] array){
		double most = 0;
		for (int i = 0; i < array.length; i++){
			if(array[i] > most){
				most = array[i];
			}
		}
		return most;
	}
	
	// Create a function that returns the month with the least rain.
	static double leastRain(double[] array){
		double least = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] < least){
				least = array[i];
			}
		}
		return least;
	}
	
	
				
}