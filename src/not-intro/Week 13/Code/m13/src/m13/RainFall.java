package m13;

import java.util.Scanner;

public class RainFall {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
	    final int SIZE = 12;
		double[] monthlyRain = new double[SIZE];
		
		System.out.println("Enter the monthly rain fall amount: ");
		int i = 0;
		
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
	
	// Total year rainfall
	
	static double sumRain(double[] array){
		double sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
			}
		return sum;
		}
	
	// Average monthly rain
	static double averageRain(double[] array){
		double average = 0;
		average = sumRain(array)/array.length;
		return average;
	}
	
	// Month with most rain
	static double mostRain(double[] array){
		double most = 0;
		for (int i = 0; i < array.length; i++){
			if(array[i] > most){
				most = array[i];
			}
		}
		return most;
	}
	
	// Month with least rain
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