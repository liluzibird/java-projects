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
	
	// Your code here
}