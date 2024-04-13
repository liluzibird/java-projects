public class Node {
	protected double data;
	protected Node next;
	protected Node previous;

	// Constructs this node with the specified numerical data value. References to the next
	// and previous nodes are assigned null.
	public Node(double initialData) {
		data = initialData;
		next = null;
		previous = null;
	}

	// Constructs this node with the specified numerical data value, references to the next
	// and previous nodes.
	public Node(double initialData, Node nextNode, Node previousNode) {
		data = initialData;
		next = nextNode;
		previous = previousNode;
	}

	// Returns this node's data.
	public double getData() {
		return data;
	}

	// Sets this node's data.
	public void setData(double newData) {
		data = newData;
	}

	// Gets the reference to the next node.
	public Node getNext() {
		return next;
	}

	// Sets the reference to the next node.
	public void setNext(Node newNext) {
		next = newNext;
	}

	// Gets the reference to the previous node.
	public Node getPrevious() {
		return previous;
	}

	// Sets the reference to the previous node.
	public void setPrevious(Node newPrevious) {
		previous = newPrevious;
	}
}
