public class IntNode {
    int dataVal;
    private IntNode nextNodeRef; // Reference to the next node

    // Constructor
    public IntNode(int value) {
        this.dataVal = value;
        this.nextNodeRef = null;
    }

    // Insert a new node after the current node
    public void insertAfter(IntNode nodeLoc) {
        IntNode tmpNext;
        tmpNext = this.nextNodeRef;
        this.nextNodeRef = nodeLoc;
        nodeLoc.nextNodeRef = tmpNext;
    }

    // Get location pointed by nextNodeRef
    public IntNode getNext() {
        return this.nextNodeRef;
    }

    // Print the node's data
    public void printData() {
        System.out.printf("%d, ", this.dataVal);
    }
}
