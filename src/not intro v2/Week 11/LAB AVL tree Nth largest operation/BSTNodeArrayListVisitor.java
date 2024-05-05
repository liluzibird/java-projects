import java.util.*;

// BSTNodeVectorVisitor stores an ArrayList of BSTNode pointers. Each call to the
// visit() method pushes the node to the back of the ArrayList.
// BSTNodeVectorVisitor also checks for duplicate node visits. Since a single
// BSTNodeVectorVisitor instance is meant to be used for at most one traversal
// through a BST, visiting the same node twice implies that a circular
// reference exists.
public class BSTNodeArrayListVisitor extends BSTNodeVisitor {
	// visitedSet is used to ensure that the exact same node instance is not
	// visited more than once.
	private HashSet<BSTNode> visitedSet = new HashSet<BSTNode>();

	private boolean hasCircRef;

	public ArrayList<BSTNode> visitedNodes = new ArrayList<BSTNode>();

	public BSTNodeArrayListVisitor() {
		hasCircRef = false;
	}

	// Returns true if a circular reference was discovered when visiting a node,
	// false otherwise.
	public boolean hasCircularReference() {
		return hasCircRef;
	}

	public boolean visit(BSTNode node) {
		// Check if the node was already visited. If so, the tree has a circular
		// reference.
		if (visitedSet.contains(node)) {
			// Set hasCircRef to true
			hasCircRef = true;

			// Return false to stop infinite traversal
			return false;
		}

		// Add node to set and ArrayList
		visitedSet.add(node);
		visitedNodes.add(node);

		// Return true to continue traversal
		return true;
	}
}
