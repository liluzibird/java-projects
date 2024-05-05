import java.util.*;
import java.io.PrintWriter;

// TreeVerifyKeysCommand verifies a BST's keys using an inorder traversal
public class TreeVerifyKeysCommand extends TreeTestCommand {
	private ArrayList<Integer> expectedKeys = new ArrayList<Integer>();

	public TreeVerifyKeysCommand(ArrayList<Integer> keys) {
		this.expectedKeys = new ArrayList<Integer>(keys);
	}

	@Override
	public boolean execute(BinarySearchTree tree, PrintWriter testFeedback) {

		// Create a BSTNodeVectorVisitor and do an in order traversal
		BSTNodeArrayListVisitor visitor = new BSTNodeArrayListVisitor();
		tree.inOrder(visitor);

		// The visitor determines if a circular reference exists
		if (visitor.hasCircularReference()) {
			testFeedback.write("FAIL: Tree traversal encountered the same node ");
			testFeedback.write("more than once, so a circular reference exists");
			testFeedback.write("\n");
			return false;
		}

		// Make an ArrayList of keys from the visitor's vector of nodes
		ArrayList<Integer> actual = new ArrayList<Integer>();
		for (BSTNode node : visitor.visitedNodes) {
			actual.add(node.getKey());
		}

		// Compare actual to expected
		boolean pass = true;
		if (actual.size() == expectedKeys.size()) {
			for (int i = 0; pass && i < expectedKeys.size(); i++) {
				if (actual.get(i) != expectedKeys.get(i)) {
					pass = false;
				}
			}
		} else {
			pass = false;
		}

		// Display results
		testFeedback.write((pass ? "PASS" : "FAIL"));
		testFeedback.write(": Inorder key verification" + "\n");
		testFeedback.write(" Expected: " + expectedKeys + "\n");
		testFeedback.write(" Actual:   " + actual + "\n");

		return pass;
	}
}