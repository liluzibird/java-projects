import java.io.PrintWriter;

// TreeGetNthCommand calls the BinarySearchTree's getNthKey() method and
// verifies that the returned key matches the expected.
public class TreeGetNthCommand extends TreeTestCommand {
	private int n;
	private int expectedKey;

	public TreeGetNthCommand(int n, int expectedKey) {
		this.n = n;
		this.expectedKey = expectedKey;
	}

	@Override
	public boolean execute(BinarySearchTree tree, PrintWriter testFeedback) {
		int actualKey = tree.getNthKey(n);
		if (actualKey == expectedKey) {
			testFeedback.write("PASS: getNthKey(" + n + ") returned ");
			testFeedback.write(actualKey + "\n");
			return true;
		}

		// Actual key does not equal expected
		testFeedback.write("FAIL: getNthKey(" + n + ") returned ");
		testFeedback.write(actualKey + ", but expected key is " + expectedKey);
		testFeedback.write("\n");
		return false;
	}
}