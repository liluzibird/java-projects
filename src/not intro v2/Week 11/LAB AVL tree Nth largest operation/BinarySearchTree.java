public abstract class BinarySearchTree {
	protected BSTNode root;

	protected boolean inOrder(BSTNodeVisitor visitor, BSTNode current) {
		if (current != null) {
			// Visit left subtree first, if left child is non-null
			BSTNode left = current.getLeft();
			if (left != null) {
				if (!inOrder(visitor, left)) {
					return false;
				}
			}

			// Visit the current node. Return false if the visitor method
			// returns false.
			if (!visitor.visit(current)) {
				return false;
			}

			// Visit right subtree last, if right child is non-null
			BSTNode right = current.getRight();
			if (right != null) {
				return inOrder(visitor, right);
			}
		}
		return true;
	}

	// Inserts the node into the tree using the standard BST insertion algorithm
	protected void insertNode(BSTNode node) {
		// Check if tree is empty
		if (root == null) {
			root = node;
		} else {
			BSTNode currentNode = root;
			while (currentNode != null) {
				// Choose to go left or right
				if (node.getKey() < currentNode.getKey()) {
					// Go left. If left child is null, insert the new
					// node here.
					if (currentNode.getLeft() == null) {
						currentNode.setLeft(node);
						currentNode = null;
					} else {
						// Go left and do the loop again.
						currentNode = currentNode.getLeft();
					}
				} else {
					// Go right. If the right child is null, insert the
					// new node here.
					if (currentNode.getRight() == null) {
						currentNode.setRight(node);
						currentNode = null;
					} else {
						// Go right and do the loop again.
						currentNode = currentNode.getRight();
					}
				}
			}
		}
	}

	protected BSTNode makeNewNode(int key) {
		return new BSTNode(key);
	}

	protected boolean removeNode(BSTNode nodeToRemove) {
		if (nodeToRemove == null) {
			return false;
		}

		BSTNode parent = nodeToRemove.getParent();

		if ((nodeToRemove.getLeft() != null) && (nodeToRemove.getRight() != null)) {
			BSTNode successorNode = nodeToRemove.getRight();
			while (successorNode.getLeft() != null) {
				successorNode = successorNode.getLeft();
			}

			nodeToRemove.setKey(successorNode.getKey());

			removeNode(successorNode);
			return true;
		}

		else if (nodeToRemove == root) {
			if (nodeToRemove.getLeft() != null) {
				root = nodeToRemove.getLeft();
			} else {
				root = nodeToRemove.getRight();
			}

			if (root != null) {
				root.setParentToNull();
			}

			nodeToRemove = null;
			return true;
		}

		else if (nodeToRemove.getLeft() != null) {
			parent.replaceChild(nodeToRemove, nodeToRemove.getLeft());
		}

		else {
			parent.replaceChild(nodeToRemove, nodeToRemove.getRight());
		}

		nodeToRemove = null;

		return true;
	}

	protected BSTNode rotateLeft(BSTNode node) {
		BSTNode parent = node.getParent();
		BSTNode rightChild = node.getRight();
		BSTNode rightLeftChild = rightChild.getLeft();

		// Replace necessary children from the bottom up
		node.setRight(rightLeftChild);
		rightChild.setLeft(node);
		if (parent != null) {
			parent.replaceChild(node, rightChild);
		} else {
			root = rightChild;
			root.setParentToNull();
		}

		return node.getParent();
	}

	protected BSTNode rotateRight(BSTNode node) {
		BSTNode parent = node.getParent();
		BSTNode leftChild = node.getLeft();
		BSTNode leftRightChild = leftChild.getRight();

		node.setLeft(leftRightChild);
		leftChild.setRight(node);
		if (parent != null) {
			parent.replaceChild(node, leftChild);
		} else {
			root = leftChild;
			root.setParentToNull();
		}

		return node.getParent();
	}

	public BinarySearchTree() {
		root = null;
	}

	public abstract int getNthKey(int n);

	public BSTNode getRoot() {
		return root;
	}

	// Performs an inorder traversal of the BST. The visitor's visit() method
	// is called for each node in the tree. The visit() method returns true to
	// continue traversal, false to stop traversal. If every visit() call
	// returns true, then true is returned. If visit() returns false for any
	// node in the tree, thus terminating traversal, false is returned.
	public boolean inOrder(BSTNodeVisitor visitor) {
		return inOrder(visitor, root);
	}

	public void insertKey(int key) {
		insertNode(makeNewNode(key));
	}

	// Attempts to remove a node with a matching key. If no node has a matching
	// key then nothing is done and false is returned. Otherwise the node is
	// removed and true is returned.
	public boolean removeKey(int key) {
		BSTNode node = search(key);
		if (node == null) {
			return false;
		} else {
			return removeNode(node);
		}
	}

	// Searches for a node with a matching key. Returns the node with the
	// matching key, or null if no matching key exists in the tree.
	public BSTNode search(int desiredKey) {
		BSTNode currentNode = root;
		while (currentNode != null) {
			// Return the node if the key matches
			if (currentNode.getKey() == desiredKey) {
				return currentNode;
			}

			// Navigate to the left if the search key is
			// less than the node's key.
			else if (desiredKey < currentNode.getKey()) {
				currentNode = currentNode.getLeft();
			}

			// Navigate to the right if the search key is
			// greater than the node's key.
			else {
				currentNode = currentNode.getRight();
			}
		}

		// The key was not found in the tree.
		return null;
	}
}