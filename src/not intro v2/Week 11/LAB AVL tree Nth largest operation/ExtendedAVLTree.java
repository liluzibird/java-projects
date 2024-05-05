public class ExtendedAVLTree extends AVLTree {
	@Override
	protected BSTNode makeNewNode(int key) {
		return new ExtendedAVLNode(key);
	}
		
	@Override
	protected void insertNode(BSTNode node) {
		super.insertNode(node);
		updateSubtreeKeyCounts((ExtendedAVLNode) node.getParent());
	}

	@Override
	protected boolean removeNode(BSTNode nodeToRemove) {
		BSTNode parent = nodeToRemove.getParent();
		boolean result = super.removeNode(nodeToRemove);
		if (result && parent != null) {
			updateSubtreeKeyCounts((ExtendedAVLNode) parent);
		}
		return result;
	}

	private void updateSubtreeKeyCounts(ExtendedAVLNode node) {
		while (node != null) {
			node.updateSubtreeKeyCount();
			node = (ExtendedAVLNode) node.getParent();
		}
	}
		
	@Override
	public int getNthKey(int n) {
		return getNthKeyHelper((ExtendedAVLNode) root, n);
	}

	private int getNthKeyHelper(ExtendedAVLNode node, int n) {
		int leftCount = (node.getLeft() != null) ? ((ExtendedAVLNode) node.getLeft()).getSubtreeKeyCount() : 0;
		if (n < leftCount) {
			return getNthKeyHelper((ExtendedAVLNode) node.getLeft(), n);
		}
		else if (n == leftCount) {
			return node.getKey();
		}
		else {
			return getNthKeyHelper((ExtendedAVLNode) node.getRight(), n - leftCount - 1);
		}
	}
}
