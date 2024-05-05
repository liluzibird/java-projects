import java.util.*;
import java.io.PrintWriter;

public class LabProgram {
	public static void main(String[] args) {
	   PrintWriter testFeedback = new PrintWriter(System.out);
	   
		System.out.print("Test 1 - insertion and getSubtreeKeyCount()");
		System.out.print("\n");
		boolean test1Passed = TestCmds.test1(testFeedback);
		testFeedback.flush();
		System.out.print("\n");
		System.out.print("Test 2 - insertion, removal, and getSubtreeKeyCount()");
		System.out.print("\n");
		boolean test2Passed = TestCmds.test2(testFeedback);
		testFeedback.flush();
		System.out.print("\n");
		System.out.print("Test 3 - insertion, removal, getSubtreeKeyCount(), and getNthKey()");
		System.out.print("\n");
		boolean test3Passed = TestCmds.test3(testFeedback);
		testFeedback.flush();

		System.out.print("\n");
		System.out.print("Summary:");
		System.out.print("\n");
		System.out.print("Test 1: ");
		System.out.print((test1Passed ? "PASS" : "FAIL"));
		System.out.print("\n");
		System.out.print("Test 2: ");
		System.out.print((test2Passed ? "PASS" : "FAIL"));
		System.out.print("\n");
		System.out.print("Test 3: ");
		System.out.print((test3Passed ? "PASS" : "FAIL"));
		System.out.print("\n");
		
		testFeedback.close();
	}
}

class TestCmds {
	public static boolean executeTestCmds(ArrayList<TreeTestCommand> testCommands, PrintWriter testFeedback) {
		boolean passed = false;
		ExtendedAVLTree userTree = new ExtendedAVLTree();
		for (TreeTestCommand cmd : testCommands) {
			passed = false;
			try {
				passed = cmd.execute(userTree, testFeedback);
			} catch (RuntimeException err) {
				testFeedback.write("Runtime error while executing test case" + "\n");
				return false;
			}
			cmd = null;

			// Break the loop if the command didn't return true
			if (!passed) {
				break;
			}
		}

		return passed;
	}

	// Test 1 - insertion and getSubtreeKeyCount()
	// - Insertion of the 7 keys shown in the lab's sample tree
	// - Verify keys
	// - Verify subtree key counts
	public static boolean test1(PrintWriter testFeedback) {
		ArrayList<TreeTestCommand> testCommands = new ArrayList<TreeTestCommand>() {
			{
				add(new TreeInsertCommand(new ArrayList<Integer>(Arrays.asList(10, 20, 30, 55, 42, 19, 77))));
				add(new TreeVerifyKeysCommand(new ArrayList<Integer>(Arrays.asList(10, 19, 20, 30, 42, 55, 77))));
				add(new TreeVerifySubtreeCountsCommand(
						new ArrayList<Pair<Integer, Integer>>(Arrays.asList(new Pair<Integer, Integer>(10, 2),
								new Pair<Integer, Integer>(19, 1), new Pair<Integer, Integer>(20, 7),
								new Pair<Integer, Integer>(30, 1), new Pair<Integer, Integer>(42, 4),
								new Pair<Integer, Integer>(55, 2), new Pair<Integer, Integer>(77, 1)))));
			}
		};
		return executeTestCmds(testCommands, testFeedback);
	}

	// Test 2 - insertion, removal, and getSubtreeKeyCount()
	// - Insert 11 keys
	// - Verify keys
	// - Verify subtree key counts
	// - Remove 1 key
	// - Verify subtree key counts
	public static boolean test2(PrintWriter testFeedback) {
		ArrayList<TreeTestCommand> testCommands = new ArrayList<TreeTestCommand>() {
			{
				add(new TreeInsertCommand(
						new ArrayList<Integer>(Arrays.asList(86, 75, 23, 30, 98, 67, 53, 9, 19, 58, 14))));
				add(new TreeVerifyKeysCommand(
						new ArrayList<Integer>(Arrays.asList(9, 14, 19, 23, 30, 53, 58, 67, 75, 86, 98))));
				add(new TreeVerifySubtreeCountsCommand(
						new ArrayList<Pair<Integer, Integer>>(Arrays.asList(new Pair<Integer, Integer>(9, 2),
								new Pair<Integer, Integer>(14, 1), new Pair<Integer, Integer>(19, 4),
								new Pair<Integer, Integer>(23, 1), new Pair<Integer, Integer>(30, 11),
								new Pair<Integer, Integer>(53, 1), new Pair<Integer, Integer>(58, 3),
								new Pair<Integer, Integer>(67, 1), new Pair<Integer, Integer>(75, 6),
								new Pair<Integer, Integer>(86, 2), new Pair<Integer, Integer>(98, 1)))));
				add(new TreeRemoveCommand(new ArrayList<Integer>(Arrays.asList(75))));
				add(new TreeVerifySubtreeCountsCommand(new ArrayList<Pair<Integer, Integer>>(
						Arrays.asList(new Pair<Integer, Integer>(9, 2), new Pair<Integer, Integer>(14, 1),
								new Pair<Integer, Integer>(19, 4), new Pair<Integer, Integer>(23, 1),
								new Pair<Integer, Integer>(30, 10), new Pair<Integer, Integer>(53, 1),
								new Pair<Integer, Integer>(58, 3), new Pair<Integer, Integer>(67, 1),
								new Pair<Integer, Integer>(86, 5), new Pair<Integer, Integer>(98, 1)))));
			}
		};
		return executeTestCmds(testCommands, testFeedback);
	}

	// Test 3 - insertion, removal, getSubtreeKeyCount(), and getNthKey()
	// - Insert 18 keys
	// - Verify keys
	// - Test GetNthKey()
	// - Verify subtree key counts
	public static boolean test3(PrintWriter testFeedback) {
		ArrayList<Integer> keysToInsert = new ArrayList<Integer>(
				Arrays.asList(10, 58, 66, 18, 34, 96, 5, 48, 73, 62, 36, 16, 23, 99, 92, 95, 46, 97));
		ArrayList<Integer> sortedKeys = new ArrayList<Integer>(
				Arrays.asList(5, 10, 16, 18, 23, 34, 36, 46, 48, 58, 62, 66, 73, 92, 95, 96, 97, 99));
		ArrayList<TreeTestCommand> testCommands = new ArrayList<TreeTestCommand>() {
			{
				add(new TreeInsertCommand(keysToInsert));
				add(new TreeVerifyKeysCommand(sortedKeys));
				add(new TreeGetNthCommand(11, 66));
				add(new TreeGetNthCommand(7, 46));
				add(new TreeGetNthCommand(15, 96));
				add(new TreeGetNthCommand(4, 23));
				add(new TreeVerifySubtreeCountsCommand(new ArrayList<Pair<Integer, Integer>>(
						Arrays.asList(new Pair<Integer, Integer>(5, 1), new Pair<Integer, Integer>(10, 3),
								new Pair<Integer, Integer>(16, 1), new Pair<Integer, Integer>(18, 9),
								new Pair<Integer, Integer>(23, 1), new Pair<Integer, Integer>(34, 2),
								new Pair<Integer, Integer>(36, 5), new Pair<Integer, Integer>(46, 1),
								new Pair<Integer, Integer>(48, 2), new Pair<Integer, Integer>(58, 18),
								new Pair<Integer, Integer>(62, 1), new Pair<Integer, Integer>(66, 2),
								new Pair<Integer, Integer>(73, 8), new Pair<Integer, Integer>(92, 2),
								new Pair<Integer, Integer>(95, 1), new Pair<Integer, Integer>(96, 5),
								new Pair<Integer, Integer>(97, 1), new Pair<Integer, Integer>(99, 2)))));
				add(new TreeRemoveCommand(new ArrayList<Integer>(Arrays.asList(58))));
				add(new TreeVerifySubtreeCountsCommand(
						new ArrayList<Pair<Integer, Integer>>(Arrays.asList(new Pair<Integer, Integer>(5, 1),
								new Pair<Integer, Integer>(10, 3), new Pair<Integer, Integer>(16, 1),
								new Pair<Integer, Integer>(18, 9), new Pair<Integer, Integer>(23, 1),
								new Pair<Integer, Integer>(34, 2), new Pair<Integer, Integer>(36, 5),
								new Pair<Integer, Integer>(46, 1), new Pair<Integer, Integer>(48, 2),
								new Pair<Integer, Integer>(62, 17), new Pair<Integer, Integer>(66, 1),
								new Pair<Integer, Integer>(73, 4), new Pair<Integer, Integer>(92, 2),
								new Pair<Integer, Integer>(95, 1), new Pair<Integer, Integer>(96, 7),
								new Pair<Integer, Integer>(97, 1), new Pair<Integer, Integer>(99, 2)))));
				add(new TreeGetNthCommand(9, 62));
				add(new TreeGetNthCommand(3, 18));
				add(new TreeGetNthCommand(10, 66));
				add(new TreeGetNthCommand(5, 34));
			}
		};
		return executeTestCmds(testCommands, testFeedback);
	}
}

//Basic Pair class for test cases
class Pair<T, U> {
	public T var0;
	public U var1;

	public Pair(T x, U y) {
		var0 = x;
		var1 = y;
	}

	public T getVar0() {
		return var0;
	}

	public U getVar1() {
		return var1;
	}
}
