public class ExtendedAVLTree extends AVLTree {
	// Each node in an ExtendedAVLTree is an ExtendedAVLNode
	@Override
	protected BSTNode makeNewNode(int key) {
		return new ExtendedAVLNode(key);
	}
	
	// Your code here
		
	@Override
	public int getNthKey(int n) {
	   // Your code here (remove placeholder line below)
		return 0;
	}
}
