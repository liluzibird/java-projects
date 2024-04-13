import java.util.Scanner;
import java.io.PrintWriter;

public class LabProgram {
	// Prints the SortedNumberList's contents, in order from head to tail
	public static void printList(SortedNumberList list) {
		Node node = list.head;
		while (null != node) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String inputLine;

		// Read the line of input numbers
		inputLine = scnr.nextLine();

		// Split on space character
		String[] terms = inputLine.split(" ");

		// Insert each value and show the sorted list's contents after each insertion
		SortedNumberList list = new SortedNumberList();

		for (Object term : terms) {
			double number = Double.parseDouble(term.toString());
			System.out.println("List after inserting " + number + ": ");
			list.insert(number);
			printList(list);
		}

      /*
		// Read the input line with numbers to remove
		inputLine = scnr.nextLine();
		terms = inputLine.split(" ");

		for (Object term : terms) {
			double number = Double.parseDouble(term.toString());
			System.out.println("List after removing " + number + ": ");
			list.remove(number);
			printList(list);
		}
		*/
	}
}
