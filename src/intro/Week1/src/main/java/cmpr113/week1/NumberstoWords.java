package cmpr113.week1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class NumberstoWords {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("\nEnter the check amount: $");
		double amount = keyboard.nextDouble();
		
		String [] holder = String.valueOf(amount).split("\\.");
		
		int dollars = Integer.parseInt(holder[0]);
		int cents = Integer.parseInt(holder[1]);
		
		if (cents == 0)
			System.out.printf("%sdollars and 0 cents", numbersToString(dollars));
		else
			System.out.printf("%sdollars and %scents", numbersToString(dollars), numbersToString(cents));
	}
	
	private static String numbersToString(int number) {
	    switch (number) {
	        case 0:
	            return "";
	        case 1:
	            return "one ";
	        case 2:
	            return "two ";
	        case 3:
	            return "three ";
	        case 4:
	            return "four ";
	        case 5:
	            return "five ";
	        case 6:
	            return "six ";
	        case 7:
	            return "seven ";
	        case 8:
	            return "eight ";
	        case 9:
	            return "nine ";
	        case 10:
	            return "ten ";
	        case 11:
	            return "eleven ";
	        case 12:
	            return "twelve ";
	        case 13:
	            return "thirteen ";
	        case 14:
	            return "fourteen ";
	        case 15:
	            return "fifteen ";
	        case 16:
	            return "sixteen ";
	        case 17:
	            return "seventeen ";
	        case 18:
	            return "eighteen ";
	        case 19:
	            return "nineteen ";
	        case 20:
	            return "twenty ";
	        case 30:
	            return "thirty ";
	        case 40:
	            return "fourty ";
	        case 50:
	            return "fifty ";
	        case 60:
	            return "sixty ";
	        case 70:
	            return "seventy ";
	        case 80:
	            return "eighty ";
	        case 90:
	            return "ninety ";
	        default:
	            int hundredThousands = number % 1000000 / 1000;
	            int hundreds = number % 1000 / 100;
	            int decimals = number % 100 / 10;
	            int integers = number % 10;

	            String result = "";
	            if (hundredThousands > 0) {
	                result += numbersToString(hundredThousands) + "thousand, ";
	            }
	            if (hundreds > 0) {
	                result += numbersToString(hundreds) + "hundred ";
	            }
	            if (decimals > 1) {
	                result += numbersToString(decimals * 10);
	                if (integers > 0) {
	                    result += numbersToString(integers);
	                }
	            } else if (decimals != 0) {
	                result += numbersToString(decimals * 10 + integers);
	            }

	            return result;
	    }
	}

}