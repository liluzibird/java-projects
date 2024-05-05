import java.util.*;
import java.io.PrintWriter;

public class TreeVerifySubtreeCountsCommand extends TreeTestCommand {
	private ArrayList<Pair<Integer, Integer>> expectedPairs = new ArrayList<Pair<Integer, Integer>>();

	public TreeVerifySubtreeCountsCommand(ArrayList<Pair<Integer, Integer>> expectedKeyCountPairs) {
		expectedPairs = new ArrayList<Pair<Integer, Integer>>(expectedKeyCountPairs);
	}

	@Override
	public boolean execute(BinarySearchTree tree, PrintWriter testFeedback) {

		// Create a BSTNodeVectorVisitor and do an in order traversal
		BSTNodeArrayListVisitor visitor = new BSTNodeArrayListVisitor();
		tree.inOrder(visitor);

		// Compare actual to expected
		boolean passed = true;
		if (visitor.visitedNodes.size() == expectedPairs.size()) {
			for (int i = 0; i < expectedPairs.size(); i++) {
				int expectedCount = expectedPairs.get(i).getVar1();

				// Get the actual node visited and the node's subtree key count
				BSTNode actualNode = visitor.visitedNodes.get(i);
				int actualCount = actualNode.getSubtreeKeyCount();

				// Compare actual vs. expected subtree key count
				if (actualCount != expectedCount) {
					testFeedback.write("FAIL: Node with key " + actualNode.getKey());
					testFeedback.write(" has a subtree key count of ");
					testFeedback.write(actualCount + ", but the expected subtree ");
					testFeedback.write("key count is " + expectedCount + "\n");
					passed = false;
				} else {
					testFeedback.write("PASS: Node with key " + actualNode.getKey());
					testFeedback.write(" has a subtree key count of ");
					testFeedback.write(actualCount + "\n");
				}
			}

			if (!passed) {
				return false;
			}

			// Display results
			testFeedback.write("PASS: All " + expectedPairs.size() + " nodes ");
			testFeedback.write("have correct subtree key counts" + "\n");
			return true;
		}

		// Give feedback indicating that the number of nodes in the tree is
		// incorrect
		testFeedback.write("FAIL: Traversal through tree encountered ");
		testFeedback.write(visitor.visitedNodes.size() + " nodes before ");
		testFeedback.write("either stopping or encountering a circular ");
		testFeedback.write("reference. But ");
		if (1 == expectedPairs.size()) {
			testFeedback.write("only one node was ");
		} else {
			testFeedback.write(expectedPairs.size() + " nodes were ");
		}
		testFeedback.write("expected in the tree." + "\n");

		return false;
	}
}