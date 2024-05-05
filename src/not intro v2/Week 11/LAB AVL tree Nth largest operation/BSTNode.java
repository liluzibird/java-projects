public class BSTNode {
	private int key;
	private BSTNode parent;
	private BSTNode left;
	private BSTNode right;

	// Constructs the BSTNode with the given key. Left, right, and parent
	// references are assigned with null.
	public BSTNode(int nodeKey) {
		key = nodeKey;
		left = null;
		right = null;
		parent = null;
	}

	public int getKey() {
		return key;
	}

	public BSTNode getLeft() {
		return left;
	}

	public BSTNode getParent() {
		return parent;
	}

	public BSTNode getRight() {
		return right;
	}

	// getSubtreeKeyCount() must be overridden in an inheriting class
	public int getSubtreeKeyCount() {
		return -1;
	}

	// Replace a current child with a new child. Determines if the current child
	// is on the left or right, and calls either setLeft() or setRight() with
	// the new node appropriately.
	// Returns true if the new child is assigned, false otherwise.
	public boolean replaceChild(BSTNode currentChild, BSTNode newChild) {
		if (left == currentChild) {
			setLeft(newChild);
			return true;
		} else if (right == currentChild) {
			setRight(newChild);
			return true;
		}

		// If neither of the above cases applied, then the new child
		// could not be attached to this node.
		return false;
	}

	public void setKey(int newKey) {
		key = newKey;
	}

	public void setLeft(BSTNode newLeftChild) {
		// Assign the left child
		left = newLeftChild;

		// If left child is non-null, assign left child's parent
		if (left != null) {
			left.parent = this;
		}
	}

	public void setParentToNull() {
		parent = null;
	}

	public void setRight(BSTNode newRightChild) {
		// Assign the right child
		right = newRightChild;

		// If right child is non-null, assign right child's parent
		if (right != null) {
			right.parent = this;
		}
	}

	public String toString() {
		return String.valueOf(key);
	}
}