public class SortedNumberList {
	public Node head;
	public Node tail;

	public SortedNumberList() {
		head = null;
		tail = null;
	}

	// Inserts the number into the list in the correct position such that the
	// list remains sorted in ascending order.
	public void insert(double number) {
		Node newNode = new Node(number); // Create a new node with the given number

		// If the list is empty, make the new node the head and tail
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			// If the list is not empty, find the correct position for the new node
			Node current = head;
			Node previous = null;
			while (current != null && current.getData() < number) {
				previous = current;
				current = current.getNext();
			}

			// Insert the new node at the found position
			if (previous == null) {
				// Insert at the beginning of the list
				newNode.setNext(head);
				head = newNode;
			} else if (current == null) {
				// Insert at the end of the list
				tail.setNext(newNode);
				tail = newNode;
			} else {
				// Insert in the middle of the list
				newNode.setNext(current);
				previous.setNext(newNode);
			}
		}
	}

	// Removes the node with the specified number value from the list. Returns
	// true if the node is found and removed, false otherwise.
	public boolean remove(double number) {
		// If the list is empty, there's nothing to remove
		if (head == null) {
			return false;
		}

		// If the head node is the one to remove, remove it
		if (head.getData() == number) {
			head = head.getNext();
			return true;
		}

		// If the head node is not the one to remove, find the node to remove
		Node current = head;
		Node previous = null;
		while (current != null && current.getData() != number) {
			previous = current;
			current = current.getNext();
		}

		// If the node to remove was found, remove it
		if (current != null) {
			previous.setNext(current.getNext());
			return true;
		}

		// If the node to remove was not found, return false
		return false;
	}
}
