public class AVLNode extends BSTNode {
	private int height;

	private int getLeftHeight() {
		AVLNode leftChild = (AVLNode) getLeft();
		if (leftChild != null) {
			return leftChild.height;
		}
		return -1;
	}

	private int getRightHeight() {
		AVLNode rightChild = (AVLNode) getRight();
		if (rightChild != null) {
			return rightChild.height;
		}
		return -1;
	}

	// Constructs the AVLNode with the given key. Left, right, and parent
	// pointers are assigned with null and height is assigned with 0.
	public AVLNode(int nodeKey) {
		super(nodeKey);
		height = 0;
	}

	// Calculate this node's balance factor, defined as:
	// height(left subtree) - height(right subtree)
	public int getBalance() {
		// Get height of left and right subtrees
		int leftHeight = getLeftHeight();
		int rightHeight = getRightHeight();

		// Calculate the balance factor.
		return leftHeight - rightHeight;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public void setLeft(BSTNode newLeftChild) {
		// Call parent class's setLeft() first
		super.setLeft(newLeftChild);

		// Update height
		updateHeight();
	}

	@Override
	public void setRight(BSTNode newRightChild) {
		// Call parent class's setRight() first
		super.setRight(newRightChild);

		// Update height
		updateHeight();
	}

	// Recalculate the current height of the subtree rooted at
	// the node, usually called after a subtree has been
	// modified.
	public void updateHeight() {
		// Get height of left and right subtrees
		int leftHeight = getLeftHeight();
		int rightHeight = getRightHeight();

		// Assign height with greater of the two, plus one
		height = ((leftHeight > rightHeight) ? leftHeight : rightHeight) + 1;
	}
}