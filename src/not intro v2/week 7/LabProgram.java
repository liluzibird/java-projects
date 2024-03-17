import java.io.PrintWriter;
import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
		GroceryList groceryList = new GroceryList();
		PrintWriter testFeedback = new PrintWriter(System.out);

		String command;
		boolean quit = false;

		while (!quit) {
			command = scnr.nextLine();

			// Process user input
			if (command.equals("print")) {
				groceryList.print(testFeedback);
			} else if (0 == command.indexOf("add ")) {
				groceryList.addWithUndo(command.substring(4));
			} else if (0 == command.indexOf("removeat ")) {
				int index = Integer.parseInt(command.substring(9));
				groceryList.removeAtWithUndo(index);
			} else if (0 == command.indexOf("swap ")) {
				int index1 = -1, index2 = -1;
				String str = command.substring(5);

				if (str.indexOf(" ") != -1) {
					index1 = Integer.parseInt(str.substring(0, 1));
					index2 = Integer.parseInt(str.substring(2, 3));
					groceryList.swapWithUndo(index1, index2);
				} else {
					System.out.print("\"swap\" command requires two indices, separated ");
					System.out.println("by a space. Ex: swap 2 5");
				}
			} else if (command.equals("undo")) {
				if (0 == groceryList.getUndoStackSize()) {
					System.out.println("Cannot execute undo because undo stack is empty");
				} else {
					groceryList.executeUndo();
				}
			} else if (command.equals("quit")) {
				quit = true;
			} else {
				System.out.println("Unknown command: " + command);
			}
			testFeedback.flush();
		}
	}
}