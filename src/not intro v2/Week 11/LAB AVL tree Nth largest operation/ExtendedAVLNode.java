public class ExtendedAVLNode extends AVLNode {
	private int subtreeKeyCount;

	public ExtendedAVLNode(int nodeKey) {
		super(nodeKey);
		subtreeKeyCount = 1;
	}

	@Override
	public int getSubtreeKeyCount() {
		return subtreeKeyCount;
	}
	
	public void updateSubtreeKeyCount() {
		subtreeKeyCount = 1;
		if (getLeft() != null) {
			subtreeKeyCount += ((ExtendedAVLNode) getLeft()).getSubtreeKeyCount();
		}
		if (getRight() != null) {
			subtreeKeyCount += ((ExtendedAVLNode) getRight()).getSubtreeKeyCount();
		}
	}

	@Override
	public void setLeft(BSTNode newLeftChild) {
		super.setLeft(newLeftChild);
		updateSubtreeKeyCount();
	}

	@Override
	public void setRight(BSTNode newRightChild) {
		super.setRight(newRightChild);
		updateSubtreeKeyCount();
	}
}
