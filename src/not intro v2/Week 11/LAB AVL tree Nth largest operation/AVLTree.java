public class AVLTree extends BinarySearchTree {
	@Override
	protected void insertNode(BSTNode node) {
		// AVL insertion starts with the standard BST insertion
		super.insertNode(node);

		// Then rebalancing occurs along a path from the new node's parent up
		// to the root.
		node = (AVLNode) node.getParent();
		while (node != null) {
			rebalance((AVLNode) node);
			node = (AVLNode) node.getParent();
		}
	}

	protected void BSTInsertNode(BSTNode node) {
		super.insertNode(node);
	}

	@Override
	protected BSTNode makeNewNode(int key) {
		return new AVLNode(key);
	}

	// Updates the given node's height and rebalances the subtree if the
	// balance factor is now -2 or +2. Rebalancing is done by performing one or
	// two rotations. Returns the subtree's new root if a rotation occurred, or
	// the node itself if no rebalancing was required.
	protected AVLNode rebalance(AVLNode node) {
		// First update the height of this node.
		node.updateHeight();

		// Check for an imbalance.
		if (node.getBalance() == -2) {
			// The subtree is too big to the right.
			AVLNode rightChild = (AVLNode) node.getRight();
			if (rightChild.getBalance() == 1) {
				// Double rotation case. First do a right rotation
				// on the right child.
				rotateRight(node.getRight());
			}

			// A left rotation will now make the subtree balanced.
			return (AVLNode) rotateLeft(node);
		} else if (node.getBalance() == 2) {
			// The subtree is too big to the left
			AVLNode leftChild = (AVLNode) node.getLeft();
			if (leftChild.getBalance() == -1) {
				// Double rotation case. First do a left rotation
				// on the left child.
				rotateLeft(node.getLeft());
			}

			// A right rotation will now make the subtree balanced.
			return (AVLNode) rotateRight(node);
		}

		// No imbalance, so just return the original node.
		return node;
	}

	protected boolean removeAVLNode(AVLNode nodeToRemove) {
		if (nodeToRemove == null) {
			return false;
		}

		// Parent needed for rebalancing.
		BSTNode parent = nodeToRemove.getParent();

		// Case 1: Internal node with 2 children
		if ((nodeToRemove.getLeft() != null) && (nodeToRemove.getRight() != null)) {
			// Find successor
			BSTNode successorNode = nodeToRemove.getRight();
			while (successorNode.getLeft() != null) {
				successorNode = successorNode.getLeft();
			}

			// Copy the key from the node
			nodeToRemove.setKey(successorNode.getKey());

			// Recursively remove successor
			removeNode(successorNode);

			// Nothing left to do since the recursive call will have rebalanced
			return true;
		}

		// Case 2: Root node (with 1 or 0 children)
		else if (nodeToRemove == root) {
			if (nodeToRemove.getLeft() != null) {
				root = (AVLNode) nodeToRemove.getLeft();
			} else {
				root = (AVLNode) nodeToRemove.getRight();
			}

			if (root != null) {
				root.setParentToNull();
			}

			nodeToRemove = null;
			return true;
		}

		// Case 3: Internal with left child only
		else if (nodeToRemove.getLeft() != null) {
			parent.replaceChild(nodeToRemove, nodeToRemove.getLeft());
		}

		// Case 4: Internal with right child only OR leaf
		else {
			parent.replaceChild(nodeToRemove, nodeToRemove.getRight());
		}

		// nodeToRemove is removed from the tree and can be deleted
		nodeToRemove = null;

		// Anything that was below nodeToRemove that has persisted is already
		// correctly balanced, but ancestors of nodeToRemove may need rebalancing.
		AVLNode nodeToRebalance = (AVLNode) parent;
		while (nodeToRebalance != null) {
			rebalance(nodeToRebalance);
			nodeToRebalance = (AVLNode) nodeToRebalance.getParent();
		}

		return true;
	}

	@Override
	protected boolean removeNode(BSTNode nodeToRemove) {
		return removeAVLNode((AVLNode) nodeToRemove);
	}

	public AVLTree() {
		// Note: Parent class's constructor does all needed work
	}

	@Override
	public int getNthKey(int n) {
		// Note: The ExtendedAVLTree.java implementation of 
		// getNthKey() should override this.
		return 0;
	}
}
